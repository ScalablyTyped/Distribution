package typings.hlsJs.anon

import typings.hlsJs.mod.CMCD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCMCDController extends StObject {
  
  /**
    * Append query args to a uri.
    */
  /* static member */
  def appendQueryToUri(uri: Any, query: Any): Any
  
  /**
    * Serialize a CMCD data object according to the rules defined in the
    * section 3.2 of
    * [CTA-5004](https://cdn.cta.tech/cta/media/media/resources/standards/pdfs/cta-5004-final.pdf).
    */
  /* static member */
  def serialize(data: CMCD): String
  
  /**
    * Convert a CMCD data object to request headers according to the rules
    * defined in the section 2.1 and 3.2 of
    * [CTA-5004](https://cdn.cta.tech/cta/media/media/resources/standards/pdfs/cta-5004-final.pdf).
    */
  /* static member */
  def toHeaders(data: CMCD): PartialCMCDHeaders
  
  /**
    * Convert a CMCD data object to query args according to the rules
    * defined in the section 2.2 and 3.2 of
    * [CTA-5004](https://cdn.cta.tech/cta/media/media/resources/standards/pdfs/cta-5004-final.pdf).
    */
  /* static member */
  def toQuery(data: CMCD): String
  
  /**
    * Generate a random v4 UUI
    *
    * @returns {string}
    */
  /* static member */
  def uuid(): String
}
object TypeofCMCDController {
  
  inline def apply(
    appendQueryToUri: (Any, Any) => Any,
    serialize: CMCD => String,
    toHeaders: CMCD => PartialCMCDHeaders,
    toQuery: CMCD => String,
    uuid: () => String
  ): TypeofCMCDController = {
    val __obj = js.Dynamic.literal(appendQueryToUri = js.Any.fromFunction2(appendQueryToUri), serialize = js.Any.fromFunction1(serialize), toHeaders = js.Any.fromFunction1(toHeaders), toQuery = js.Any.fromFunction1(toQuery), uuid = js.Any.fromFunction0(uuid))
    __obj.asInstanceOf[TypeofCMCDController]
  }
  
  extension [Self <: TypeofCMCDController](x: Self) {
    
    inline def setAppendQueryToUri(value: (Any, Any) => Any): Self = StObject.set(x, "appendQueryToUri", js.Any.fromFunction2(value))
    
    inline def setSerialize(value: CMCD => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
    
    inline def setToHeaders(value: CMCD => PartialCMCDHeaders): Self = StObject.set(x, "toHeaders", js.Any.fromFunction1(value))
    
    inline def setToQuery(value: CMCD => String): Self = StObject.set(x, "toQuery", js.Any.fromFunction1(value))
    
    inline def setUuid(value: () => String): Self = StObject.set(x, "uuid", js.Any.fromFunction0(value))
  }
}
