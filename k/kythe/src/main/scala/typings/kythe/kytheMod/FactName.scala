package typings.kythe.kytheMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FactName with String] = js.native
  /* "/kythe/build/config" */ @js.native
  object BUILD_CONFIG extends TopLevel[BUILD_CONFIG with String]
  
  /* "/kythe/code" */ @js.native
  object CODE extends TopLevel[CODE with String]
  
  /* "/kythe/complete" */ @js.native
  object COMPLETE extends TopLevel[COMPLETE with String]
  
  /* "/kythe/context/url" */ @js.native
  object CONTEXT_URL extends TopLevel[CONTEXT_URL with String]
  
  /* "/kythe/details" */ @js.native
  object DETAILS extends TopLevel[DETAILS with String]
  
  /* "/kythe/doc/uri" */ @js.native
  object DOC_URI extends TopLevel[DOC_URI with String]
  
  /* "/kythe/label" */ @js.native
  object LABEL extends TopLevel[LABEL with String]
  
  /* "/kythe/loc/end" */ @js.native
  object LOC_END extends TopLevel[LOC_END with String]
  
  /* "/kythe/loc/start" */ @js.native
  object LOC_START extends TopLevel[LOC_START with String]
  
  /* "/kythe/message" */ @js.native
  object MESSAGE extends TopLevel[MESSAGE with String]
  
  /* "/kythe/node/kind" */ @js.native
  object NODE_KIND extends TopLevel[NODE_KIND with String]
  
  /* "/kythe/param/default" */ @js.native
  object PARAM_DEFAULT extends TopLevel[PARAM_DEFAULT with String]
  
  /* "/kythe/ruleclass" */ @js.native
  object RULE_CLASS extends TopLevel[RULE_CLASS with String]
  
  /* "/kythe/snippet/end" */ @js.native
  object SNIPPET_END extends TopLevel[SNIPPET_END with String]
  
  /* "/kythe/snippet/start" */ @js.native
  object SNIPPET_START extends TopLevel[SNIPPET_START with String]
  
  /* "/kythe/subkind" */ @js.native
  object SUBKIND extends TopLevel[SUBKIND with String]
  
  /* "/kythe/text" */ @js.native
  object TEXT extends TopLevel[TEXT with String]
  
  /* "/kythe/text/encoding" */ @js.native
  object TEXT_ENCODING extends TopLevel[TEXT_ENCODING with String]
  
  /* "/kythe/visibility" */ @js.native
  object VISIBILITY extends TopLevel[VISIBILITY with String]
  
}

