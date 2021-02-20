package typings.imap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait New extends StObject {
    
    /** Number of messages in this mailbox having the Recent flag (this IMAP session is the first to see these messages). */
    var `new`: Double = js.native
    
    /** Total number of messages in this mailbox. */
    var total: Double = js.native
    
    /** (Only available with status() calls) Number of messages in this mailbox not having the Seen flag (marked as not having been read). */
    var unseen: Double = js.native
  }
  object New {
    
    @scala.inline
    def apply(`new`: Double, total: Double, unseen: Double): New = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any], unseen = unseen.asInstanceOf[js.Any])
      __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
      __obj.asInstanceOf[New]
    }
    
    @scala.inline
    implicit class NewMutableBuilder[Self <: New] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNew(value: Double): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnseen(value: Double): Self = StObject.set(x, "unseen", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Other extends StObject {
    
    /** Mailboxes that belong to other users that the logged in user has access to. */
    var other: js.Array[_] = js.native
    
    /** Mailboxes that belong to the logged in user. */
    var personal: js.Array[_] = js.native
    
    /** Mailboxes that are accessible by any logged in user. */
    var shared: js.Array[_] = js.native
  }
  object Other {
    
    @scala.inline
    def apply(other: js.Array[_], personal: js.Array[_], shared: js.Array[_]): Other = {
      val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], personal = personal.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any])
      __obj.asInstanceOf[Other]
    }
    
    @scala.inline
    implicit class OtherMutableBuilder[Self <: Other] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOther(value: js.Array[_]): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherVarargs(value: js.Any*): Self = StObject.set(x, "other", js.Array(value :_*))
      
      @scala.inline
      def setPersonal(value: js.Array[_]): Self = StObject.set(x, "personal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonalVarargs(value: js.Any*): Self = StObject.set(x, "personal", js.Array(value :_*))
      
      @scala.inline
      def setShared(value: js.Array[_]): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedVarargs(value: js.Any*): Self = StObject.set(x, "shared", js.Array(value :_*))
    }
  }
}
