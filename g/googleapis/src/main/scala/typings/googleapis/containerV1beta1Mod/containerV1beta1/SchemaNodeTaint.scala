package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Kubernetes taint is comprised of three fields: key, value, and effect.
  * Effect can only be one of three types:  NoSchedule, PreferNoSchedule or
  * NoExecute.  For more information, including usage and the valid values,
  * see:
  * https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
  */
trait SchemaNodeTaint extends StObject {
  
  /**
    * Effect for taint.
    */
  var effect: js.UndefOr[String] = js.undefined
  
  /**
    * Key for taint.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Value for taint.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaNodeTaint {
  
  @scala.inline
  def apply(): SchemaNodeTaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeTaint]
  }
  
  @scala.inline
  implicit class SchemaNodeTaintMutableBuilder[Self <: SchemaNodeTaint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffect(value: String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
