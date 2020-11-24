package typings.kythe.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FactName extends js.Object
@JSImport("kythe", "FactName")
@js.native
object FactName extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FactName with String] = js.native
  
  @js.native
  sealed trait BUILD_CONFIG extends FactName
  /* "/kythe/build/config" */ @js.native
  object BUILD_CONFIG extends TopLevel[BUILD_CONFIG with String]
  
  @js.native
  sealed trait CODE extends FactName
  /* "/kythe/code" */ @js.native
  object CODE extends TopLevel[CODE with String]
  
  @js.native
  sealed trait COMPLETE extends FactName
  /* "/kythe/complete" */ @js.native
  object COMPLETE extends TopLevel[COMPLETE with String]
  
  @js.native
  sealed trait CONTEXT_URL extends FactName
  /* "/kythe/context/url" */ @js.native
  object CONTEXT_URL extends TopLevel[CONTEXT_URL with String]
  
  @js.native
  sealed trait DETAILS extends FactName
  /* "/kythe/details" */ @js.native
  object DETAILS extends TopLevel[DETAILS with String]
  
  @js.native
  sealed trait DOC_URI extends FactName
  /* "/kythe/doc/uri" */ @js.native
  object DOC_URI extends TopLevel[DOC_URI with String]
  
  @js.native
  sealed trait LABEL extends FactName
  /* "/kythe/label" */ @js.native
  object LABEL extends TopLevel[LABEL with String]
  
  @js.native
  sealed trait LOC_END extends FactName
  /* "/kythe/loc/end" */ @js.native
  object LOC_END extends TopLevel[LOC_END with String]
  
  @js.native
  sealed trait LOC_START extends FactName
  /* "/kythe/loc/start" */ @js.native
  object LOC_START extends TopLevel[LOC_START with String]
  
  @js.native
  sealed trait MESSAGE extends FactName
  /* "/kythe/message" */ @js.native
  object MESSAGE extends TopLevel[MESSAGE with String]
  
  @js.native
  sealed trait NODE_KIND extends FactName
  /* "/kythe/node/kind" */ @js.native
  object NODE_KIND extends TopLevel[NODE_KIND with String]
  
  @js.native
  sealed trait PARAM_DEFAULT extends FactName
  /* "/kythe/param/default" */ @js.native
  object PARAM_DEFAULT extends TopLevel[PARAM_DEFAULT with String]
  
  @js.native
  sealed trait RULE_CLASS extends FactName
  /* "/kythe/ruleclass" */ @js.native
  object RULE_CLASS extends TopLevel[RULE_CLASS with String]
  
  @js.native
  sealed trait SNIPPET_END extends FactName
  /* "/kythe/snippet/end" */ @js.native
  object SNIPPET_END extends TopLevel[SNIPPET_END with String]
  
  @js.native
  sealed trait SNIPPET_START extends FactName
  /* "/kythe/snippet/start" */ @js.native
  object SNIPPET_START extends TopLevel[SNIPPET_START with String]
  
  @js.native
  sealed trait SUBKIND extends FactName
  /* "/kythe/subkind" */ @js.native
  object SUBKIND extends TopLevel[SUBKIND with String]
  
  @js.native
  sealed trait TEXT extends FactName
  /* "/kythe/text" */ @js.native
  object TEXT extends TopLevel[TEXT with String]
  
  @js.native
  sealed trait TEXT_ENCODING extends FactName
  /* "/kythe/text/encoding" */ @js.native
  object TEXT_ENCODING extends TopLevel[TEXT_ENCODING with String]
  
  @js.native
  sealed trait VISIBILITY extends FactName
  /* "/kythe/visibility" */ @js.native
  object VISIBILITY extends TopLevel[VISIBILITY with String]
}
