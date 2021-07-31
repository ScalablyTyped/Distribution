package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A key-value pair applied to a given object.
  */
trait SchemaLabel extends StObject {
  
  /**
    * The key of a label is a syntactically valid URL (as per RFC 1738) with
    * the &quot;scheme&quot; and initial slashes omitted and with the
    * additional restrictions noted below.  Each key should be globally unique.
    * The &quot;host&quot; portion is called the &quot;namespace&quot; and is
    * not necessarily resolvable to a network endpoint.  Instead, the namespace
    * indicates what system or entity defines the semantics of the label.
    * Namespaces do not restrict the set of objects to which a label may be
    * associated.  Keys are defined by the following grammar:    key          =
    * hostname &quot;/&quot; kpath   kpath        = ksegment *[ &quot;/&quot;
    * ksegment ]   ksegment     = alphadigit | *[ alphadigit | &quot;-&quot; |
    * &quot;_&quot; | &quot;.&quot; ]  where &quot;hostname&quot; and
    * &quot;alphadigit&quot; are defined as in RFC 1738.  Example key:
    * spanner.google.com/universe
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * An integer value.
    */
  var numValue: js.UndefOr[String] = js.undefined
  
  /**
    * A string value.
    */
  var strValue: js.UndefOr[String] = js.undefined
}
object SchemaLabel {
  
  @scala.inline
  def apply(): SchemaLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLabel]
  }
  
  @scala.inline
  implicit class SchemaLabelMutableBuilder[Self <: SchemaLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setNumValue(value: String): Self = StObject.set(x, "numValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumValueUndefined: Self = StObject.set(x, "numValue", js.undefined)
    
    @scala.inline
    def setStrValue(value: String): Self = StObject.set(x, "strValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrValueUndefined: Self = StObject.set(x, "strValue", js.undefined)
  }
}
