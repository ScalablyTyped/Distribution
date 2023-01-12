package typings.lls

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.lls.mod.LargeLocalStorageInterfaces.LargeLocalStorageService
import typings.lls.mod.LargeLocalStorageInterfaces.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("lls", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with LargeLocalStorageService {
    def this(options: Options) = this()
  }
  @JSImport("lls", JSImport.Namespace)
  @js.native
  val ^ : LargeLocalStorageService = js.native
  
  object LargeLocalStorageInterfaces {
    
    trait Entry extends StObject {
      
      var attachKey: String
      
      var data: Any
      
      var docKey: String
      
      var url: String
    }
    object Entry {
      
      inline def apply(attachKey: String, data: Any, docKey: String, url: String): Entry = {
        val __obj = js.Dynamic.literal(attachKey = attachKey.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], docKey = docKey.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[Entry]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
        
        inline def setAttachKey(value: String): Self = StObject.set(x, "attachKey", value.asInstanceOf[js.Any])
        
        inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDocKey(value: String): Self = StObject.set(x, "docKey", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait LargeLocalStorageService
      extends StObject
         with Instantiable1[/* options */ Options, LargeLocalStorageService] {
      
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
      def getAttachment(attachKey: String): Promise[Any] = js.native
      /**
        * Get the attachment identified by docKey and attachKey
        */
      def getAttachment(docKey: String, attachKey: String): Promise[Any] = js.native
      
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
      def getContents(docKey: String): Promise[Any] = js.native
      
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
      def rm(): Promise[Any] = js.native
      def rm(docKey: String): Promise[Any] = js.native
      
      /**
        * Remove an attachment from a document.
        */
      def rmAttachment(docKey: String, attachKey: String): Promise[Unit] = js.native
      
      /**
        * Set an attachment for a given document. Identified by attachKey.
        */
      def setAttachment(attachKey: String, attachment: Any): Promise[Unit] = js.native
      /**
        * Set an attachment for a given document. Identified by docKey and attachKey.
        */
      def setAttachment(docKey: String, attachKey: String, attachment: Any): Promise[Unit] = js.native
      
      /**
        * Set the contents identified by docKey to data. The document will be created if it does not exist.
        */
      def setContents(docKey: String, data: Any): Promise[Unit] = js.native
    }
    
    trait Options extends StObject {
      
      /**
        * Force LLS to use a specific storage implementation: 'IndexedDB' or 'WebSQL' or 'FilesystemAPI'.
        */
      var forceProvider: js.UndefOr[String] = js.undefined
      
      /**
        * Optional name for your LLS database. Defaults to lls. This is the name given to the underlying IndexedDB or WebSQL DB or FSAPI Folder. LLS's with different names are independent.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Desired capacity in bytes.
        */
      var size: Double
    }
    object Options {
      
      inline def apply(size: Double): Options = {
        val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setForceProvider(value: String): Self = StObject.set(x, "forceProvider", value.asInstanceOf[js.Any])
        
        inline def setForceProviderUndefined: Self = StObject.set(x, "forceProvider", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Promise[T] extends StObject {
      
      def `catch`[U](): Promise[U] = js.native
      def `catch`[U](onRejected: js.Function1[/* error */ Any, U | Promise[U]]): Promise[U] = js.native
      
      def `then`[U](): Promise[U] = js.native
      def `then`[U](onFulfilled: js.Function1[/* value */ T, U | Promise[U]]): Promise[U] = js.native
      def `then`[U](
        onFulfilled: js.Function1[/* value */ T, Promise[U] | U],
        onRejected: js.Function1[/* error */ Any, Promise[U] | U | Unit]
      ): Promise[U] = js.native
      def `then`[U](onFulfilled: Unit, onRejected: js.Function1[/* error */ Any, Promise[U] | U | Unit]): Promise[U] = js.native
    }
  }
  
  type _To = LargeLocalStorageService
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: LargeLocalStorageService = ^
}
