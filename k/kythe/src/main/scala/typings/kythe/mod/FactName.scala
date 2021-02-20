package typings.kythe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FactName extends StObject
@JSImport("kythe", "FactName")
@js.native
object FactName extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FactName with String] = js.native
  
  @js.native
  sealed trait BUILD_CONFIG extends FactName
  /* "/kythe/build/config" */ val BUILD_CONFIG: typings.kythe.mod.FactName.BUILD_CONFIG with String = js.native
  
  @js.native
  sealed trait CODE extends FactName
  /* "/kythe/code" */ val CODE: typings.kythe.mod.FactName.CODE with String = js.native
  
  @js.native
  sealed trait COMPLETE extends FactName
  /* "/kythe/complete" */ val COMPLETE: typings.kythe.mod.FactName.COMPLETE with String = js.native
  
  @js.native
  sealed trait CONTEXT_URL extends FactName
  /* "/kythe/context/url" */ val CONTEXT_URL: typings.kythe.mod.FactName.CONTEXT_URL with String = js.native
  
  @js.native
  sealed trait DETAILS extends FactName
  /* "/kythe/details" */ val DETAILS: typings.kythe.mod.FactName.DETAILS with String = js.native
  
  @js.native
  sealed trait DOC_URI extends FactName
  /* "/kythe/doc/uri" */ val DOC_URI: typings.kythe.mod.FactName.DOC_URI with String = js.native
  
  @js.native
  sealed trait LABEL extends FactName
  /* "/kythe/label" */ val LABEL: typings.kythe.mod.FactName.LABEL with String = js.native
  
  @js.native
  sealed trait LOC_END extends FactName
  /* "/kythe/loc/end" */ val LOC_END: typings.kythe.mod.FactName.LOC_END with String = js.native
  
  @js.native
  sealed trait LOC_START extends FactName
  /* "/kythe/loc/start" */ val LOC_START: typings.kythe.mod.FactName.LOC_START with String = js.native
  
  @js.native
  sealed trait MESSAGE extends FactName
  /* "/kythe/message" */ val MESSAGE: typings.kythe.mod.FactName.MESSAGE with String = js.native
  
  @js.native
  sealed trait NODE_KIND extends FactName
  /* "/kythe/node/kind" */ val NODE_KIND: typings.kythe.mod.FactName.NODE_KIND with String = js.native
  
  @js.native
  sealed trait PARAM_DEFAULT extends FactName
  /* "/kythe/param/default" */ val PARAM_DEFAULT: typings.kythe.mod.FactName.PARAM_DEFAULT with String = js.native
  
  @js.native
  sealed trait RULE_CLASS extends FactName
  /* "/kythe/ruleclass" */ val RULE_CLASS: typings.kythe.mod.FactName.RULE_CLASS with String = js.native
  
  @js.native
  sealed trait SNIPPET_END extends FactName
  /* "/kythe/snippet/end" */ val SNIPPET_END: typings.kythe.mod.FactName.SNIPPET_END with String = js.native
  
  @js.native
  sealed trait SNIPPET_START extends FactName
  /* "/kythe/snippet/start" */ val SNIPPET_START: typings.kythe.mod.FactName.SNIPPET_START with String = js.native
  
  @js.native
  sealed trait SUBKIND extends FactName
  /* "/kythe/subkind" */ val SUBKIND: typings.kythe.mod.FactName.SUBKIND with String = js.native
  
  @js.native
  sealed trait TEXT extends FactName
  /* "/kythe/text" */ val TEXT: typings.kythe.mod.FactName.TEXT with String = js.native
  
  @js.native
  sealed trait TEXT_ENCODING extends FactName
  /* "/kythe/text/encoding" */ val TEXT_ENCODING: typings.kythe.mod.FactName.TEXT_ENCODING with String = js.native
  
  @js.native
  sealed trait VISIBILITY extends FactName
  /* "/kythe/visibility" */ val VISIBILITY: typings.kythe.mod.FactName.VISIBILITY with String = js.native
}
