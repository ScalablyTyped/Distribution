package typings.linguiConf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtractorType extends StObject {
  
  def extract(filename: String, code: String, onMessageExtracted: js.Function1[/* msg */ ExtractedMessage, Unit]): js.Promise[Unit] | Unit = js.native
  def extract(
    filename: String,
    code: String,
    onMessageExtracted: js.Function1[/* msg */ ExtractedMessage, Unit],
    ctx: ExtractorCtx
  ): js.Promise[Unit] | Unit = js.native
  
  def `match`(filename: String): Boolean = js.native
}
