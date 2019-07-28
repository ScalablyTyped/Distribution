package typings.lls.llsMod.LargeLocalStorageInterfacesNs

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LargeLocalStorageService extends Instantiable1[/* options */ Options, LargeLocalStorageService] {
  var initialized: Promise[Double] = js.native
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

