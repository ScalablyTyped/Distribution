package typings.gulpStylus

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-stylus", JSImport.Namespace)
  @js.native
  def apply(): ReadWriteStream = js.native
  @JSImport("gulp-stylus", JSImport.Namespace)
  @js.native
  def apply(options: Options): ReadWriteStream = js.native
  
  @js.native
  trait Options extends StObject {
    
    var compress: js.UndefOr[Boolean] = js.native
    
    var `include css`: js.UndefOr[Boolean] = js.native
    
    var linenos: js.UndefOr[Boolean] = js.native
    
    var rawDefine: js.UndefOr[VariableDefinitions] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def `setInclude css`(value: Boolean): Self = StObject.set(x, "include css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setInclude cssUndefined`: Self = StObject.set(x, "include css", js.undefined)
      
      @scala.inline
      def setLinenos(value: Boolean): Self = StObject.set(x, "linenos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinenosUndefined: Self = StObject.set(x, "linenos", js.undefined)
      
      @scala.inline
      def setRawDefine(value: VariableDefinitions): Self = StObject.set(x, "rawDefine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawDefineUndefined: Self = StObject.set(x, "rawDefine", js.undefined)
    }
  }
  
  type VariableDefinitions = StringDictionary[js.Any]
}
