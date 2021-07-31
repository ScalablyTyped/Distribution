package typings.lineColumnPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("line-column-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(path: PathLike): ParsedPath = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(path.asInstanceOf[js.Any]).asInstanceOf[ParsedPath]
  
  @scala.inline
  def stringify(path: PathDescriptor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify(path: PathDescriptor, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Inlined type-fest.type-fest.Mutable<std.Required<line-column-path.line-column-path.PathDescriptor>> */
  trait ParsedPath extends StObject {
    
    var column: Double
    
    var file: String
    
    var line: Double
  }
  object ParsedPath {
    
    @scala.inline
    def apply(column: Double, file: String, line: Double): ParsedPath = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedPath]
    }
    
    @scala.inline
    implicit class ParsedPathMutableBuilder[Self <: ParsedPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait PathDescriptor extends StObject {
    
    val column: js.UndefOr[Double] = js.undefined
    
    val file: String
    
    val line: js.UndefOr[Double] = js.undefined
  }
  object PathDescriptor {
    
    @scala.inline
    def apply(file: String): PathDescriptor = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathDescriptor]
    }
    
    @scala.inline
    implicit class PathDescriptorMutableBuilder[Self <: PathDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    }
  }
  
  type PathLike = String | PathDescriptor
  
  trait StringifyOptions extends StObject {
    
    /**
    	Output the column.
    	Setting this to `false` will result in `unicorn.js:8` instead of `unicorn.js:8:14`.
    	@default true
    	*/
    var column: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Output the file path.
    	Setting this to `false` will result in `8:18` instead of `unicorn.js:8:14`.
    	@default true
    	*/
    val file: js.UndefOr[Boolean] = js.undefined
  }
  object StringifyOptions {
    
    @scala.inline
    def apply(): StringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyOptions]
    }
    
    @scala.inline
    implicit class StringifyOptionsMutableBuilder[Self <: StringifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Boolean): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setFile(value: Boolean): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    }
  }
}
