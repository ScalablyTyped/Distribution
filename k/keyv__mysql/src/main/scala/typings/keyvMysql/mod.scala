package typings.keyvMysql

import typings.keyv.mod.Store
import typings.keyvMysql.keyvMysqlBooleans.`false`
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@keyv/mysql", JSImport.Namespace)
  @js.native
  class ^ () extends KeyvMysql {
    def this(options: Options) = this()
    def this(uri: String) = this()
  }
  
  @js.native
  trait KeyvMysql
    extends EventEmitter
       with Store[js.UndefOr[String]] {
    
    var namespace: js.UndefOr[String] = js.native
    
    def set(key: String): js.Promise[_] = js.native
    def set(key: String, value: String): js.Promise[_] = js.native
    
    val ttlSupport: `false` = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var keySize: js.UndefOr[Double] = js.native
    
    var table: js.UndefOr[String] = js.native
    
    var uri: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeySize(value: Double): Self = StObject.set(x, "keySize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySizeUndefined: Self = StObject.set(x, "keySize", js.undefined)
      
      @scala.inline
      def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
