package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that handles html sanitization.
  */
@js.native
trait ISanitizer extends StObject {
  
  /**
    * @returns Whether to replace URLs by HTML anchors.
    */
  var getAutolink: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /**
    * Sanitize an HTML string.
    *
    * @param dirty - The dirty text.
    * @param options - The optional sanitization options.
    *
    * @returns The sanitized string.
    */
  def sanitize(dirty: String): String = js.native
  def sanitize(dirty: String, options: ISanitizerOptions): String = js.native
}
