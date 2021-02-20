package typings.ltijs

import typings.ltijs.anon.Data
import typings.ltijs.anon.KeepAlive
import typings.ltijs.ltijsBooleans.`false`
import typings.ltijs.ltijsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseMod {
  
  @js.native
  trait Database extends StObject {
    
    def Close(): js.Promise[`true`] = js.native
    
    def Decrypt(data: String, _iv: String, secret: String): js.Promise[String] = js.native
    
    def Delete(collection: String, query: js.Object): js.Promise[`true`] = js.native
    
    def Get(encryptionKey: String, collection: String, query: js.Object): js.Promise[js.Object | `false`] = js.native
    @JSName("Get")
    def Get_false(encryptionKey: `false`, collection: String, query: js.Object): js.Promise[js.Object | `false`] = js.native
    
    def Insert(encryptionKey: String, collection: String, item: js.Object, index: js.Object): js.Promise[`true`] = js.native
    @JSName("Insert")
    def Insert_false(encryptionKey: `false`, collection: String, item: js.Object, index: js.Object): js.Promise[`true`] = js.native
    
    def Modify(encryptionKey: String, collection: String, query: js.Object, modification: js.Object): js.Promise[`true`] = js.native
    @JSName("Modify")
    def Modify_false(encryptionKey: `false`, collection: String, query: js.Object, modification: js.Object): js.Promise[`true`] = js.native
    
    def encrypt(data: String, secret: String): js.Promise[Data] = js.native
    
    def setup(): js.Promise[`true`] = js.native
  }
  
  @js.native
  trait DatabaseOptions extends StObject {
    
    var connection: js.UndefOr[KeepAlive] = js.native
    
    var plugin: js.UndefOr[js.Object] = js.native
    
    var url: String = js.native
  }
  object DatabaseOptions {
    
    @scala.inline
    def apply(url: String): DatabaseOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatabaseOptions]
    }
    
    @scala.inline
    implicit class DatabaseOptionsMutableBuilder[Self <: DatabaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnection(value: KeepAlive): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      @scala.inline
      def setPlugin(value: js.Object): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
