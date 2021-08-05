package typings.mailgunJs.mod

import typings.mailgunJs.anon.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lists {
  
  @js.native
  trait Member extends StObject {
    
    def delete(): js.Promise[js.Any] = js.native
    def delete(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): js.Promise[js.Any] = js.native
    
    def update(data: MemberUpdateData): js.Promise[js.Any] = js.native
    def update(data: MemberUpdateData, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): js.Promise[js.Any] = js.native
  }
  
  trait MemberAddMultipleData extends StObject {
    
    var members: js.Array[Address]
    
    var upsert: js.UndefOr[Boolean] = js.undefined
  }
  object MemberAddMultipleData {
    
    inline def apply(members: js.Array[Address]): MemberAddMultipleData = {
      val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemberAddMultipleData]
    }
    
    extension [Self <: MemberAddMultipleData](x: Self) {
      
      inline def setMembers(value: js.Array[Address]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersVarargs(value: Address*): Self = StObject.set(x, "members", js.Array(value :_*))
      
      inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
      
      inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
    }
  }
  
  trait MemberCreateData extends StObject {
    
    var address: String
    
    var name: String
    
    var subscribed: Boolean
    
    var vars: js.UndefOr[js.Object] = js.undefined
  }
  object MemberCreateData {
    
    inline def apply(address: String, name: String, subscribed: Boolean): MemberCreateData = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemberCreateData]
    }
    
    extension [Self <: MemberCreateData](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
      
      inline def setVars(value: js.Object): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
      
      inline def setVarsUndefined: Self = StObject.set(x, "vars", js.undefined)
    }
  }
  
  trait MemberUpdateData extends StObject {
    
    var name: String
    
    var subscribed: Boolean
    
    var vars: js.UndefOr[js.Object] = js.undefined
  }
  object MemberUpdateData {
    
    inline def apply(name: String, subscribed: Boolean): MemberUpdateData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemberUpdateData]
    }
    
    extension [Self <: MemberUpdateData](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
      
      inline def setVars(value: js.Object): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
      
      inline def setVarsUndefined: Self = StObject.set(x, "vars", js.undefined)
    }
  }
  
  @js.native
  trait Members extends StObject {
    
    def add(data: MemberAddMultipleData): js.Promise[js.Any] = js.native
    def add(data: MemberAddMultipleData, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): js.Promise[js.Any] = js.native
    
    def create(data: MemberCreateData): js.Promise[js.Any] = js.native
    def create(data: MemberCreateData, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): js.Promise[js.Any] = js.native
    
    def list(): js.Promise[js.Any] = js.native
    def list(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): js.Promise[js.Any] = js.native
  }
}
