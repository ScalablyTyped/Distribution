package typings.hummerEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("hummer-env/components/Text", "Text")
  @js.native
  /**
    * 文本展示控件。
    */
  open class TextCls ()
    extends StObject
       with Text
  
  @js.native
  trait Text
    extends StObject
       with HummerComponent {
    
    /**
      * 富文本内容
      */
    var rickText: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.rickTextType */ Any = js.native
    
    @JSName("style")
    var style_Text: TextStyle = js.native
    
    /**
      * 普通文本内容
      */
    var text: String = js.native
    
    /**
      * 是否支持长按复制功能 默认 false
      */
    var textCopyEnable: Boolean = js.native
  }
}
