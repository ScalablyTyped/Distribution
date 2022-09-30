package typings.lineColumnPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("line-column-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseLineColumnPath(path: PathLike): ParsedPath = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLineColumnPath")(path.asInstanceOf[js.Any]).asInstanceOf[ParsedPath]
  
  inline def stringifyLineColumnPath(path: PathDescriptor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyLineColumnPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifyLineColumnPath(path: PathDescriptor, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyLineColumnPath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type ParsedPath = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Mutable<Required<PathDescriptor>> */ Any
  
  trait PathDescriptor extends StObject {
    
    val column: js.UndefOr[Double] = js.undefined
    
    val file: String
    
    val line: js.UndefOr[Double] = js.undefined
  }
  object PathDescriptor {
    
    inline def apply(file: String): PathDescriptor = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathDescriptor]
    }
    
    extension [Self <: PathDescriptor](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    }
  }
  
  type PathLike = String | PathDescriptor
  
  trait StringifyOptions extends StObject {
    
    /**
    	Output the column.
    	Setting this to `false` will result in `unicorn.js:8` instead of `unicorn.js:8:14`.
    	@default true
    	*/
    val column: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Output the file path.
    	Setting this to `false` will result in `8:18` instead of `unicorn.js:8:14`.
    	@default true
    	*/
    val file: js.UndefOr[Boolean] = js.undefined
  }
  object StringifyOptions {
    
    inline def apply(): StringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyOptions]
    }
    
    extension [Self <: StringifyOptions](x: Self) {
      
      inline def setColumn(value: Boolean): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setFile(value: Boolean): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    }
  }
}
