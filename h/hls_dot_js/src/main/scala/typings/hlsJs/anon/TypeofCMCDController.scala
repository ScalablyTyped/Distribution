package typings.hlsJs.anon

import org.scalablytyped.runtime.Instantiable1
import typings.hlsJs.mod.CMCD
import typings.hlsJs.mod.CMCDController
import typings.hlsJs.mod.Hls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCMCDController
  extends StObject
     with Instantiable1[/* hls */ Hls, CMCDController] {
  
  /**
    * Append query args to a uri.
    */
  def appendQueryToUri(uri: Any, query: Any): Any = js.native
  
  /**
    * Serialize a CMCD data object according to the rules defined in the
    * section 3.2 of
    * [CTA-5004](https://cdn.cta.tech/cta/media/media/resources/standards/pdfs/cta-5004-final.pdf).
    */
  def serialize(data: CMCD): String = js.native
  
  /**
    * Convert a CMCD data object to request headers according to the rules
    * defined in the section 2.1 and 3.2 of
    * [CTA-5004](https://cdn.cta.tech/cta/media/media/resources/standards/pdfs/cta-5004-final.pdf).
    */
  def toHeaders(data: CMCD): PartialCMCDHeaders = js.native
  
  /**
    * Convert a CMCD data object to query args according to the rules
    * defined in the section 2.2 and 3.2 of
    * [CTA-5004](https://cdn.cta.tech/cta/media/media/resources/standards/pdfs/cta-5004-final.pdf).
    */
  def toQuery(data: CMCD): String = js.native
  
  /**
    * Generate a random v4 UUI
    *
    * @returns {string}
    */
  def uuid(): String = js.native
}
