package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLabel extends StObject {
  
  /**
    * The key of a label is a syntactically valid URL (as per RFC 1738) with the "scheme" and initial slashes omitted and with the additional restrictions noted below. Each key should be globally unique. The "host" portion is called the "namespace" and is not necessarily resolvable to a network endpoint. Instead, the namespace indicates what system or entity defines the semantics of the label. Namespaces do not restrict the set of objects to which a label may be associated. Keys are defined by the following grammar: key = hostname "/" kpath kpath = ksegment *[ "/" ksegment ] ksegment = alphadigit | *[ alphadigit | "-" | "_" | "." ] where "hostname" and "alphadigit" are defined as in RFC 1738. Example key: spanner.google.com/universe
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An integer value.
    */
  var numValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A string value.
    */
  var strValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaLabel {
  
  inline def apply(): SchemaLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLabel]
  }
  
  extension [Self <: SchemaLabel](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setNumValue(value: String): Self = StObject.set(x, "numValue", value.asInstanceOf[js.Any])
    
    inline def setNumValueNull: Self = StObject.set(x, "numValue", null)
    
    inline def setNumValueUndefined: Self = StObject.set(x, "numValue", js.undefined)
    
    inline def setStrValue(value: String): Self = StObject.set(x, "strValue", value.asInstanceOf[js.Any])
    
    inline def setStrValueNull: Self = StObject.set(x, "strValue", null)
    
    inline def setStrValueUndefined: Self = StObject.set(x, "strValue", js.undefined)
  }
}
