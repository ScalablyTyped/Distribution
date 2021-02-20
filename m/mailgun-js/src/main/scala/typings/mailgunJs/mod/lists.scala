package typings.mailgunJs.mod

import typings.mailgunJs.anon.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lists {
  
  @js.native
  trait Member extends StObject {
    
    def delete(): js.Promise[_] = js.native
    def delete(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): js.Promise[_] = js.native
    
    def update(data: MemberUpdateData): js.Promise[_] = js.native
    def update(data: MemberUpdateData, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): js.Promise[_] = js.native
  }
  
  @js.native
  trait MemberAddMultipleData extends StObject {
    
    var members: js.Array[Address] = js.native
    
    var upsert: js.UndefOr[Boolean] = js.native
  }
  object MemberAddMultipleData {
    
    @scala.inline
    def apply(members: js.Array[Address]): MemberAddMultipleData = {
      val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemberAddMultipleData]
    }
    
    @scala.inline
    implicit class MemberAddMultipleDataMutableBuilder[Self <: MemberAddMultipleData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMembers(value: js.Array[Address]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembersVarargs(value: Address*): Self = StObject.set(x, "members", js.Array(value :_*))
      
      @scala.inline
      def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
    }
  }
  
  @js.native
  trait MemberCreateData extends StObject {
    
    var address: String = js.native
    
    var name: String = js.native
    
    var subscribed: Boolean = js.native
    
    var vars: js.UndefOr[js.Object] = js.native
  }
  object MemberCreateData {
    
    @scala.inline
    def apply(address: String, name: String, subscribed: Boolean): MemberCreateData = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemberCreateData]
    }
    
    @scala.inline
    implicit class MemberCreateDataMutableBuilder[Self <: MemberCreateData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVars(value: js.Object): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVarsUndefined: Self = StObject.set(x, "vars", js.undefined)
    }
  }
  
  @js.native
  trait MemberUpdateData extends StObject {
    
    var name: String = js.native
    
    var subscribed: Boolean = js.native
    
    var vars: js.UndefOr[js.Object] = js.native
  }
  object MemberUpdateData {
    
    @scala.inline
    def apply(name: String, subscribed: Boolean): MemberUpdateData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemberUpdateData]
    }
    
    @scala.inline
    implicit class MemberUpdateDataMutableBuilder[Self <: MemberUpdateData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVars(value: js.Object): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVarsUndefined: Self = StObject.set(x, "vars", js.undefined)
    }
  }
  
  @js.native
  trait Members extends StObject {
    
    def add(data: MemberAddMultipleData): js.Promise[_] = js.native
    def add(data: MemberAddMultipleData, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): js.Promise[_] = js.native
    
    def create(data: MemberCreateData): js.Promise[_] = js.native
    def create(data: MemberCreateData, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): js.Promise[_] = js.native
    
    def list(): js.Promise[_] = js.native
    def list(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): js.Promise[_] = js.native
  }
}
