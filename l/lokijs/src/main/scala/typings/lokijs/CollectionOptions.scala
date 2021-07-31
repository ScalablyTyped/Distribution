package typings.lokijs

import typings.lokijs.lokijsStrings.`jquery-extend-deep`
import typings.lokijs.lokijsStrings.`parse-stringify`
import typings.lokijs.lokijsStrings.`shallow-assign`
import typings.lokijs.lokijsStrings.`shallow-recurse-objects`
import typings.lokijs.lokijsStrings.shallow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionOptions[E] extends StObject {
  
  var adaptiveBinaryIndices: Boolean
  
  var asyncListeners: Boolean
  
  var autoupdate: Boolean
  
  var cloneMethod: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects`
  
  @JSName("clone")
  var clone_FCollectionOptions: Boolean
  
  var disableChangesApi: Boolean
  
  var disableDeltaChangesApi: Boolean
  
  var disableMeta: Boolean
  
  var exact: js.Array[/* keyof E */ String]
  
  var indices: (/* keyof E */ String) | (js.Array[/* keyof E */ String])
  
  var serializableIndices: Boolean
  
  var transactional: Boolean
  
  var ttl: Double
  
  var ttlInterval: Double
  
  var unique: js.Array[/* keyof E */ String]
}
object CollectionOptions {
  
  @scala.inline
  def apply[E](
    adaptiveBinaryIndices: Boolean,
    asyncListeners: Boolean,
    autoupdate: Boolean,
    cloneMethod: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects`,
    clone_ : Boolean,
    disableChangesApi: Boolean,
    disableDeltaChangesApi: Boolean,
    disableMeta: Boolean,
    exact: js.Array[/* keyof E */ String],
    indices: (/* keyof E */ String) | (js.Array[/* keyof E */ String]),
    serializableIndices: Boolean,
    transactional: Boolean,
    ttl: Double,
    ttlInterval: Double,
    unique: js.Array[/* keyof E */ String]
  ): CollectionOptions[E] = {
    val __obj = js.Dynamic.literal(adaptiveBinaryIndices = adaptiveBinaryIndices.asInstanceOf[js.Any], asyncListeners = asyncListeners.asInstanceOf[js.Any], autoupdate = autoupdate.asInstanceOf[js.Any], cloneMethod = cloneMethod.asInstanceOf[js.Any], disableChangesApi = disableChangesApi.asInstanceOf[js.Any], disableDeltaChangesApi = disableDeltaChangesApi.asInstanceOf[js.Any], disableMeta = disableMeta.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], serializableIndices = serializableIndices.asInstanceOf[js.Any], transactional = transactional.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], ttlInterval = ttlInterval.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(clone_.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionOptions[E]]
  }
  
  @scala.inline
  implicit class CollectionOptionsMutableBuilder[Self <: CollectionOptions[?], E] (val x: Self & CollectionOptions[E]) extends AnyVal {
    
    @scala.inline
    def setAdaptiveBinaryIndices(value: Boolean): Self = StObject.set(x, "adaptiveBinaryIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncListeners(value: Boolean): Self = StObject.set(x, "asyncListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoupdate(value: Boolean): Self = StObject.set(x, "autoupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloneMethod(
      value: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects`
    ): Self = StObject.set(x, "cloneMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableChangesApi(value: Boolean): Self = StObject.set(x, "disableChangesApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDeltaChangesApi(value: Boolean): Self = StObject.set(x, "disableDeltaChangesApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMeta(value: Boolean): Self = StObject.set(x, "disableMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExact(value: js.Array[/* keyof E */ String]): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactVarargs(value: (/* keyof E */ String)*): Self = StObject.set(x, "exact", js.Array(value :_*))
    
    @scala.inline
    def setIndices(value: (/* keyof E */ String) | (js.Array[/* keyof E */ String])): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesVarargs(value: (/* keyof E */ String)*): Self = StObject.set(x, "indices", js.Array(value :_*))
    
    @scala.inline
    def setSerializableIndices(value: Boolean): Self = StObject.set(x, "serializableIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactional(value: Boolean): Self = StObject.set(x, "transactional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlInterval(value: Double): Self = StObject.set(x, "ttlInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(value: js.Array[/* keyof E */ String]): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueVarargs(value: (/* keyof E */ String)*): Self = StObject.set(x, "unique", js.Array(value :_*))
  }
}
