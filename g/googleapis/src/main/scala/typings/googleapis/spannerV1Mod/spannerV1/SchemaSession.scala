package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A session in the Cloud Spanner API.
  */
trait SchemaSession extends StObject {
  
  /**
    * Output only. The approximate timestamp when the session is last used. It
    * is typically earlier than the actual last use time.
    */
  var approximateLastUseTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The timestamp when the session is created.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * The labels for the session.   * Label keys must be between 1 and 63
    * characters long and must conform to    the following regular expression:
    * `[a-z]([-a-z0-9]*[a-z0-9])?`.  * Label values must be between 0 and 63
    * characters long and must conform    to the regular expression
    * `([a-z]([-a-z0-9]*[a-z0-9])?)?`.  * No more than 64 labels can be
    * associated with a given session.  See https://goo.gl/xmQnxf for more
    * information on and examples of labels.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The name of the session. This is always system-assigned; values provided
    * when creating a session are ignored.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaSession {
  
  inline def apply(): SchemaSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSession]
  }
  
  extension [Self <: SchemaSession](x: Self) {
    
    inline def setApproximateLastUseTime(value: String): Self = StObject.set(x, "approximateLastUseTime", value.asInstanceOf[js.Any])
    
    inline def setApproximateLastUseTimeUndefined: Self = StObject.set(x, "approximateLastUseTime", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
