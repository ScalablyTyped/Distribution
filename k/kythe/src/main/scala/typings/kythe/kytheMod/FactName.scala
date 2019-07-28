package typings.kythe.kytheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FactName extends js.Object

@JSImport("kythe", "FactName")
@js.native
object FactName extends js.Object {
  @js.native
  sealed trait BUILD_CONFIG extends FactName
  
  @js.native
  sealed trait CODE extends FactName
  
  @js.native
  sealed trait COMPLETE extends FactName
  
  @js.native
  sealed trait CONTEXT_URL extends FactName
  
  @js.native
  sealed trait DETAILS extends FactName
  
  @js.native
  sealed trait DOC_URI extends FactName
  
  @js.native
  sealed trait LABEL extends FactName
  
  @js.native
  sealed trait LOC_END extends FactName
  
  @js.native
  sealed trait LOC_START extends FactName
  
  @js.native
  sealed trait MESSAGE extends FactName
  
  @js.native
  sealed trait NODE_KIND extends FactName
  
  @js.native
  sealed trait PARAM_DEFAULT extends FactName
  
  @js.native
  sealed trait RULE_CLASS extends FactName
  
  @js.native
  sealed trait SNIPPET_END extends FactName
  
  @js.native
  sealed trait SNIPPET_START extends FactName
  
  @js.native
  sealed trait SUBKIND extends FactName
  
  @js.native
  sealed trait TEXT extends FactName
  
  @js.native
  sealed trait TEXT_ENCODING extends FactName
  
  @js.native
  sealed trait VISIBILITY extends FactName
  
  /* "/kythe/build/config" */ val BUILD_CONFIG: typings.kythe.kytheMod.FactName.BUILD_CONFIG with String = js.native
  /* "/kythe/code" */ val CODE: typings.kythe.kytheMod.FactName.CODE with String = js.native
  /* "/kythe/complete" */ val COMPLETE: typings.kythe.kytheMod.FactName.COMPLETE with String = js.native
  /* "/kythe/context/url" */ val CONTEXT_URL: typings.kythe.kytheMod.FactName.CONTEXT_URL with String = js.native
  /* "/kythe/details" */ val DETAILS: typings.kythe.kytheMod.FactName.DETAILS with String = js.native
  /* "/kythe/doc/uri" */ val DOC_URI: typings.kythe.kytheMod.FactName.DOC_URI with String = js.native
  /* "/kythe/label" */ val LABEL: typings.kythe.kytheMod.FactName.LABEL with String = js.native
  /* "/kythe/loc/end" */ val LOC_END: typings.kythe.kytheMod.FactName.LOC_END with String = js.native
  /* "/kythe/loc/start" */ val LOC_START: typings.kythe.kytheMod.FactName.LOC_START with String = js.native
  /* "/kythe/message" */ val MESSAGE: typings.kythe.kytheMod.FactName.MESSAGE with String = js.native
  /* "/kythe/node/kind" */ val NODE_KIND: typings.kythe.kytheMod.FactName.NODE_KIND with String = js.native
  /* "/kythe/param/default" */ val PARAM_DEFAULT: typings.kythe.kytheMod.FactName.PARAM_DEFAULT with String = js.native
  /* "/kythe/ruleclass" */ val RULE_CLASS: typings.kythe.kytheMod.FactName.RULE_CLASS with String = js.native
  /* "/kythe/snippet/end" */ val SNIPPET_END: typings.kythe.kytheMod.FactName.SNIPPET_END with String = js.native
  /* "/kythe/snippet/start" */ val SNIPPET_START: typings.kythe.kytheMod.FactName.SNIPPET_START with String = js.native
  /* "/kythe/subkind" */ val SUBKIND: typings.kythe.kytheMod.FactName.SUBKIND with String = js.native
  /* "/kythe/text" */ val TEXT: typings.kythe.kytheMod.FactName.TEXT with String = js.native
  /* "/kythe/text/encoding" */ val TEXT_ENCODING: typings.kythe.kytheMod.FactName.TEXT_ENCODING with String = js.native
  /* "/kythe/visibility" */ val VISIBILITY: typings.kythe.kytheMod.FactName.VISIBILITY with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FactName with String] = js.native
}

