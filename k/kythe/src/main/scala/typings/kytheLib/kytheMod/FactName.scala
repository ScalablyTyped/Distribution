package typings
package kytheLib.kytheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FactName extends js.Object

@JSImport("kythe", "FactName")
@js.native
object FactName extends js.Object {
  @js.native
  sealed trait BUILD_CONFIG
    extends kytheLib.kytheMod.FactName
  
  @js.native
  sealed trait CODE
    extends kytheLib.kytheMod.FactName
  
  @js.native
  sealed trait COMPLETE
    extends kytheLib.kytheMod.FactName
  
  @js.native
  sealed trait CONTEXT_URL
    extends kytheLib.kytheMod.FactName
  
  @js.native
  sealed trait DETAILS
    extends kytheLib.kytheMod.FactName
  
  @js.native
  sealed trait DOC_URI
    extends kytheLib.kytheMod.FactName
  
  @js.native
  sealed trait LABEL
    extends kytheLib.kytheMod.FactName
  
  @js.native
  sealed trait LOC_END
    extends kytheLib.kytheMod.FactName
  
  @js.native
  sealed trait LOC_START
    extends kytheLib.kytheMod.FactName
  
  @js.native
  sealed trait MESSAGE
    extends kytheLib.kytheMod.FactName
  
  @js.native
  sealed trait NODE_KIND
    extends kytheLib.kytheMod.FactName
  
  @js.native
  sealed trait PARAM_DEFAULT
    extends kytheLib.kytheMod.FactName
  
  @js.native
  sealed trait RULE_CLASS
    extends kytheLib.kytheMod.FactName
  
  @js.native
  sealed trait SNIPPET_END
    extends kytheLib.kytheMod.FactName
  
  @js.native
  sealed trait SNIPPET_START
    extends kytheLib.kytheMod.FactName
  
  @js.native
  sealed trait SUBKIND
    extends kytheLib.kytheMod.FactName
  
  @js.native
  sealed trait TEXT
    extends kytheLib.kytheMod.FactName
  
  @js.native
  sealed trait TEXT_ENCODING
    extends kytheLib.kytheMod.FactName
  
  @js.native
  sealed trait VISIBILITY
    extends kytheLib.kytheMod.FactName
  
  /* "/kythe/build/config" */ val BUILD_CONFIG: BUILD_CONFIG with java.lang.String = js.native
  /* "/kythe/code" */ val CODE: CODE with java.lang.String = js.native
  /* "/kythe/complete" */ val COMPLETE: COMPLETE with java.lang.String = js.native
  /* "/kythe/context/url" */ val CONTEXT_URL: CONTEXT_URL with java.lang.String = js.native
  /* "/kythe/details" */ val DETAILS: DETAILS with java.lang.String = js.native
  /* "/kythe/doc/uri" */ val DOC_URI: DOC_URI with java.lang.String = js.native
  /* "/kythe/label" */ val LABEL: LABEL with java.lang.String = js.native
  /* "/kythe/loc/end" */ val LOC_END: LOC_END with java.lang.String = js.native
  /* "/kythe/loc/start" */ val LOC_START: LOC_START with java.lang.String = js.native
  /* "/kythe/message" */ val MESSAGE: MESSAGE with java.lang.String = js.native
  /* "/kythe/node/kind" */ val NODE_KIND: NODE_KIND with java.lang.String = js.native
  /* "/kythe/param/default" */ val PARAM_DEFAULT: PARAM_DEFAULT with java.lang.String = js.native
  /* "/kythe/ruleclass" */ val RULE_CLASS: RULE_CLASS with java.lang.String = js.native
  /* "/kythe/snippet/end" */ val SNIPPET_END: SNIPPET_END with java.lang.String = js.native
  /* "/kythe/snippet/start" */ val SNIPPET_START: SNIPPET_START with java.lang.String = js.native
  /* "/kythe/subkind" */ val SUBKIND: SUBKIND with java.lang.String = js.native
  /* "/kythe/text" */ val TEXT: TEXT with java.lang.String = js.native
  /* "/kythe/text/encoding" */ val TEXT_ENCODING: TEXT_ENCODING with java.lang.String = js.native
  /* "/kythe/visibility" */ val VISIBILITY: VISIBILITY with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[kytheLib.kytheMod.FactName with java.lang.String] = js.native
}

