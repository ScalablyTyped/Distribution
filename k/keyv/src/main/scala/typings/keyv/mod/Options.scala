package typings.keyv.mod

import org.scalablytyped.runtime.StringDictionary
import typings.keyv.keyvStrings.mongo
import typings.keyv.keyvStrings.mongodb
import typings.keyv.keyvStrings.mysql
import typings.keyv.keyvStrings.postgres
import typings.keyv.keyvStrings.postgresql
import typings.keyv.keyvStrings.redis
import typings.keyv.keyvStrings.sqlite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[TValue]
  extends /* key */ StringDictionary[js.Any] {
  
  /** Specify an adapter to use. e.g `'redis'` or `'mongodb'`. */
  var adapter: js.UndefOr[redis | mongodb | mongo | sqlite | postgresql | postgres | mysql] = js.native
  
  /** A custom deserialization function. */
  var deserialize: js.UndefOr[js.Function1[/* data */ String, TValue]] = js.native
  
  /** Namespace for the current instance. */
  var namespace: js.UndefOr[String] = js.native
  
  /** A custom serialization function. */
  var serialize: js.UndefOr[js.Function1[/* data */ TValue, String]] = js.native
  
  /** The storage adapter instance to be used by Keyv. */
  var store: js.UndefOr[Store[TValue]] = js.native
  
  /** Default TTL. Can be overridden by specififying a TTL on `.set()`. */
  var ttl: js.UndefOr[Double] = js.native
  
  /** The connection string URI. */
  var uri: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply[TValue](): Options[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[TValue]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], TValue] (val x: Self with Options[TValue]) extends AnyVal {
    
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
    def setAdapter(value: redis | mongodb | mongo | sqlite | postgresql | postgres | mysql): Self = this.set("adapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdapter: Self = this.set("adapter", js.undefined)
    
    @scala.inline
    def setDeserialize(value: /* data */ String => TValue): Self = this.set("deserialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDeserialize: Self = this.set("deserialize", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setSerialize(value: /* data */ TValue => String): Self = this.set("serialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
    
    @scala.inline
    def setStore(value: Store[TValue]): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
