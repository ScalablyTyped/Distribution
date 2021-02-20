package typings.lineColumnPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("line-column-path", "parse")
  @js.native
  def parse(path: PathLike): ParsedPath = js.native
  
  @JSImport("line-column-path", "stringify")
  @js.native
  def stringify(path: PathDescriptor): String = js.native
  @JSImport("line-column-path", "stringify")
  @js.native
  def stringify(path: PathDescriptor, options: StringifyOptions): String = js.native
  
  /* Inlined type-fest.type-fest.Mutable<std.Required<line-column-path.line-column-path.PathDescriptor>> */
  @js.native
  trait ParsedPath extends StObject {
    
    var column: Double = js.native
    
    var file: String = js.native
    
    var line: Double = js.native
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
  
  @js.native
  trait PathDescriptor extends StObject {
    
    val column: js.UndefOr[Double] = js.native
    
    val file: String = js.native
    
    val line: js.UndefOr[Double] = js.native
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
  
  @js.native
  trait StringifyOptions extends StObject {
    
    /**
    	Output the column.
    	Setting this to `false` will result in `unicorn.js:8` instead of `unicorn.js:8:14`.
    	@default true
    	*/
    var column: js.UndefOr[Boolean] = js.native
    
    /**
    	Output the file path.
    	Setting this to `false` will result in `8:18` instead of `unicorn.js:8:14`.
    	@default true
    	*/
    val file: js.UndefOr[Boolean] = js.native
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
