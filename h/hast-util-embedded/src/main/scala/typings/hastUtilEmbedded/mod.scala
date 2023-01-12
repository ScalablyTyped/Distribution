package typings.hastUtilEmbedded

import typings.hast.mod.Element
import typings.hast.mod.ElementContent
import typings.hastUtilEmbedded.hastUtilEmbeddedStrings.`object`
import typings.hastUtilEmbedded.hastUtilEmbeddedStrings.audio
import typings.hastUtilEmbedded.hastUtilEmbeddedStrings.canvas
import typings.hastUtilEmbedded.hastUtilEmbeddedStrings.embed
import typings.hastUtilEmbedded.hastUtilEmbeddedStrings.iframe
import typings.hastUtilEmbedded.hastUtilEmbeddedStrings.img
import typings.hastUtilEmbedded.hastUtilEmbeddedStrings.math
import typings.hastUtilEmbedded.hastUtilEmbeddedStrings.picture
import typings.hastUtilEmbedded.hastUtilEmbeddedStrings.svg
import typings.hastUtilEmbedded.hastUtilEmbeddedStrings.video
import typings.hastUtilIsElement.mod.AssertPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hast-util-embedded", "embedded")
  @js.native
  val embedded: AssertEmbedded = js.native
  
  type AssertEmbedded = AssertPredicate[Embedded_]
  
  trait Embedded_
    extends StObject
       with Element {
    
    @JSName("tagName")
    var tagName_Embedded_ : audio | canvas | embed | iframe | img | math | `object` | picture | svg | video
  }
  object Embedded_ {
    
    inline def apply(
      children: js.Array[ElementContent],
      tagName: audio | canvas | embed | iframe | img | math | `object` | picture | svg | video
    ): Embedded_ = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("element")
      __obj.asInstanceOf[Embedded_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Embedded_] (val x: Self) extends AnyVal {
      
      inline def setTagName(value: audio | canvas | embed | iframe | img | math | `object` | picture | svg | video): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
}
