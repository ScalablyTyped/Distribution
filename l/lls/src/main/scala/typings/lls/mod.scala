package typings.lls

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.lls.mod.LargeLocalStorageInterfaces.LargeLocalStorageService
import typings.lls.mod.LargeLocalStorageInterfaces.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("lls", JSImport.Namespace)
  @js.native
  class ^ protected () extends LargeLocalStorageService {
    def this(options: Options) = this()
  }
  @JSImport("lls", JSImport.Namespace)
  @js.native
  val ^ : LargeLocalStorageService = js.native
  
  object LargeLocalStorageInterfaces {
    
    @js.native
    trait Entry extends StObject {
      
      var attachKey: String = js.native
      
      var data: js.Any = js.native
      
      var docKey: String = js.native
      
      var url: String = js.native
    }
    object Entry {
      
      @scala.inline
      def apply(attachKey: String, data: js.Any, docKey: String, url: String): Entry = {
        val __obj = js.Dynamic.literal(attachKey = attachKey.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], docKey = docKey.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[Entry]
      }
      
      @scala.inline
      implicit class EntryMutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAttachKey(value: String): Self = StObject.set(x, "attachKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDocKey(value: String): Self = StObject.set(x, "docKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait LargeLocalStorageService extends Instantiable1[/* options */ Options, LargeLocalStorageService] {
      
      /**
        * Gets all attachments URLs for a document.
        */
      def getAllAttachmentURLs(): Promise[js.Array[Entry]] = js.native
      def getAllAttachmentURLs(docKey: String): Promise[js.Array[Entry]] = js.native
      
      /**
        * Gets all of the attachments for a document.
        */
      def getAllAttachments(): Promise[js.Array[Entry]] = js.native
      def getAllAttachments(docKey: String): Promise[js.Array[Entry]] = js.native
      
      /**
        * Get the attachment identified by attachKey
        */
      def getAttachment(attachKey: String): Promise[_] = js.native
      /**
        * Get the attachment identified by docKey and attachKey
        */
      def getAttachment(docKey: String, attachKey: String): Promise[_] = js.native
      
      /**
        * Get the URL for a given attachment.
        */
      def getAttachmentURL(attachKey: String): Promise[String] = js.native
      /**
        * Get the URL for a given attachment.
        */
      def getAttachmentURL(docKey: String, attachKey: String): Promise[String] = js.native
      
      /**
        * Returns the actual capacity of the storage or -1 if it is unknown.
        */
      def getCapacity(): Double = js.native
      
      /**
        * Get the contents of a document identified by docKey
        */
      def getContents(docKey: String): Promise[_] = js.native
      
      var initialized: Promise[Double] = js.native
      
      /**
        * List all attachments under a given key. List all documents if no key is provided.
        */
      def ls(): Promise[js.Array[String]] = js.native
      def ls(docKey: String): Promise[js.Array[String]] = js.native
      
      /**
        * Whether or not LLS is ready to store data. The initialized property can be used to await initialization.
        */
      def ready(): Boolean = js.native
      
      /**
        * Revoke the attachment URL as required by the underlying storage system.
        */
      def revokeAttachmentURL(url: String): Unit = js.native
      
      /**
        * Remove the specified document and all of its attachments.
        */
      def rm(): Promise[_] = js.native
      def rm(docKey: String): Promise[_] = js.native
      
      /**
        * Remove an attachment from a document.
        */
      def rmAttachment(docKey: String, attachKey: String): Promise[Unit] = js.native
      
      /**
        * Set an attachment for a given document. Identified by attachKey.
        */
      def setAttachment(attachKey: String, attachment: js.Any): Promise[Unit] = js.native
      /**
        * Set an attachment for a given document. Identified by docKey and attachKey.
        */
      def setAttachment(docKey: String, attachKey: String, attachment: js.Any): Promise[Unit] = js.native
      
      /**
        * Set the contents identified by docKey to data. The document will be created if it does not exist.
        */
      def setContents(docKey: String, data: js.Any): Promise[Unit] = js.native
    }
    
    @js.native
    trait Options extends StObject {
      
      /**
        * Force LLS to use a specific storage implementation: 'IndexedDB' or 'WebSQL' or 'FilesystemAPI'.
        */
      var forceProvider: js.UndefOr[String] = js.native
      
      /**
        * Optional name for your LLS database. Defaults to lls. This is the name given to the underlying IndexedDB or WebSQL DB or FSAPI Folder. LLS's with different names are independent.
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * Desired capacity in bytes.
        */
      var size: Double = js.native
    }
    object Options {
      
      @scala.inline
      def apply(size: Double): Options = {
        val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setForceProvider(value: String): Self = StObject.set(x, "forceProvider", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceProviderUndefined: Self = StObject.set(x, "forceProvider", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Promise[T] extends StObject {
      
      def `catch`[U](): Promise[U] = js.native
      def `catch`[U](onRejected: js.Function1[/* error */ js.Any, U | Promise[U]]): Promise[U] = js.native
      
      def `then`[U](): Promise[U] = js.native
      def `then`[U](
        onFulfilled: js.UndefOr[scala.Nothing],
        onRejected: js.Function1[/* error */ js.Any, Promise[U] | U | Unit]
      ): Promise[U] = js.native
      def `then`[U](onFulfilled: js.Function1[/* value */ T, U | Promise[U]]): Promise[U] = js.native
      def `then`[U](
        onFulfilled: js.Function1[/* value */ T, Promise[U] | U],
        onRejected: js.Function1[/* error */ js.Any, Promise[U] | U | Unit]
      ): Promise[U] = js.native
    }
  }
  
  type _To = LargeLocalStorageService
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: LargeLocalStorageService = ^
}
