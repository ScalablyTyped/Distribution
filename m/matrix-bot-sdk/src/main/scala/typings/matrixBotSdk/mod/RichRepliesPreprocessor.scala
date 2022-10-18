package typings.matrixBotSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "RichRepliesPreprocessor")
@js.native
/**
  * Creates a new rich replies preprocessor.
  * @param fetchRealEventContents If enabled, this preprocessor will
  * attempt to get the real event contents and append them to the event
  * information.
  */
open class RichRepliesPreprocessor ()
  extends typings.matrixBotSdk.libPreprocessorsRichRepliesPreprocessorMod.RichRepliesPreprocessor {
  def this(fetchRealEventContents: Boolean) = this()
}
