package typings.lokijs

import typings.lokijs.lokijsStrings.`jquery-extend-deep`
import typings.lokijs.lokijsStrings.`parse-stringify`
import typings.lokijs.lokijsStrings.`shallow-assign`
import typings.lokijs.lokijsStrings.`shallow-recurse-objects`
import typings.lokijs.lokijsStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionOptions[E] extends js.Object {
  
  var adaptiveBinaryIndices: Boolean = js.native
  
  var asyncListeners: Boolean = js.native
  
  var autoupdate: Boolean = js.native
  
  var cloneMethod: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects` = js.native
  
  @JSName("clone")
  var clone_FCollectionOptions: Boolean = js.native
  
  var disableChangesApi: Boolean = js.native
  
  var disableDeltaChangesApi: Boolean = js.native
  
  var disableMeta: Boolean = js.native
  
  var exact: js.Array[/* keyof E */ String] = js.native
  
  var indices: (/* keyof E */ String) | (js.Array[/* keyof E */ String]) = js.native
  
  var serializableIndices: Boolean = js.native
  
  var transactional: Boolean = js.native
  
  var ttl: Double = js.native
  
  var ttlInterval: Double = js.native
  
  var unique: js.Array[/* keyof E */ String] = js.native
}
object CollectionOptions {
  
  @scala.inline
  def apply[E](
    adaptiveBinaryIndices: Boolean,
    asyncListeners: Boolean,
    autoupdate: Boolean,
    clone: Boolean,
    cloneMethod: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects`,
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
    val __obj = js.Dynamic.literal(adaptiveBinaryIndices = adaptiveBinaryIndices.asInstanceOf[js.Any], asyncListeners = asyncListeners.asInstanceOf[js.Any], autoupdate = autoupdate.asInstanceOf[js.Any], clone = clone.asInstanceOf[js.Any], cloneMethod = cloneMethod.asInstanceOf[js.Any], disableChangesApi = disableChangesApi.asInstanceOf[js.Any], disableDeltaChangesApi = disableDeltaChangesApi.asInstanceOf[js.Any], disableMeta = disableMeta.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], serializableIndices = serializableIndices.asInstanceOf[js.Any], transactional = transactional.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], ttlInterval = ttlInterval.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionOptions[E]]
  }
  
  @scala.inline
  implicit class CollectionOptionsOps[Self <: CollectionOptions[_], E] (val x: Self with CollectionOptions[E]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdaptiveBinaryIndices(value: Boolean): Self = this.set("adaptiveBinaryIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncListeners(value: Boolean): Self = this.set("asyncListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoupdate(value: Boolean): Self = this.set("autoupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloneMethod(
      value: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects`
    ): Self = this.set("cloneMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableChangesApi(value: Boolean): Self = this.set("disableChangesApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDeltaChangesApi(value: Boolean): Self = this.set("disableDeltaChangesApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMeta(value: Boolean): Self = this.set("disableMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactVarargs(value: (/* keyof E */ String)*): Self = this.set("exact", js.Array(value :_*))
    
    @scala.inline
    def setExact(value: js.Array[/* keyof E */ String]): Self = this.set("exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesVarargs(value: (/* keyof E */ String)*): Self = this.set("indices", js.Array(value :_*))
    
    @scala.inline
    def setIndices(value: (/* keyof E */ String) | (js.Array[/* keyof E */ String])): Self = this.set("indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializableIndices(value: Boolean): Self = this.set("serializableIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactional(value: Boolean): Self = this.set("transactional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlInterval(value: Double): Self = this.set("ttlInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueVarargs(value: (/* keyof E */ String)*): Self = this.set("unique", js.Array(value :_*))
    
    @scala.inline
    def setUnique(value: js.Array[/* keyof E */ String]): Self = this.set("unique", value.asInstanceOf[js.Any])
  }
}
