package typings
package llsLib.llsMod.LargeLocalStorageInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LargeLocalStorageService
  extends org.scalablytyped.runtime.Instantiable1[/* options */ Options, LargeLocalStorageService] {
  var initialized: Promise[scala.Double] = js.native
  /**
           * Gets all attachments URLs for a document.
           */
  def getAllAttachmentURLs(): Promise[js.Array[Entry]] = js.native
  /**
           * Gets all attachments URLs for a document.
           */
  def getAllAttachmentURLs(docKey: java.lang.String): Promise[js.Array[Entry]] = js.native
  /**
           * Gets all of the attachments for a document.
           */
  def getAllAttachments(): Promise[js.Array[Entry]] = js.native
  /**
           * Gets all of the attachments for a document.
           */
  def getAllAttachments(docKey: java.lang.String): Promise[js.Array[Entry]] = js.native
  /**
           * Get the attachment identified by attachKey
           */
  def getAttachment(attachKey: java.lang.String): Promise[_] = js.native
  /**
           * Get the attachment identified by docKey and attachKey
           */
  def getAttachment(docKey: java.lang.String, attachKey: java.lang.String): Promise[_] = js.native
  /**
           * Get the URL for a given attachment.
           */
  def getAttachmentURL(attachKey: java.lang.String): Promise[java.lang.String] = js.native
  /**
           * Get the URL for a given attachment.
           */
  def getAttachmentURL(docKey: java.lang.String, attachKey: java.lang.String): Promise[java.lang.String] = js.native
  /**
           * Returns the actual capacity of the storage or -1 if it is unknown.
           */
  def getCapacity(): scala.Double = js.native
  /**
           * Get the contents of a document identified by docKey
           */
  def getContents(docKey: java.lang.String): Promise[_] = js.native
  /**
           * List all attachments under a given key. List all documents if no key is provided.
           */
  def ls(): Promise[js.Array[java.lang.String]] = js.native
  /**
           * List all attachments under a given key. List all documents if no key is provided.
           */
  def ls(docKey: java.lang.String): Promise[js.Array[java.lang.String]] = js.native
  /**
           * Whether or not LLS is ready to store data. The initialized property can be used to await initialization.
           */
  def ready(): scala.Boolean = js.native
  /**
           * Revoke the attachment URL as required by the underlying storage system.
           */
  def revokeAttachmentURL(url: java.lang.String): scala.Unit = js.native
  /**
           * Remove the specified document and all of its attachments.
           */
  def rm(): Promise[_] = js.native
  /**
           * Remove the specified document and all of its attachments.
           */
  def rm(docKey: java.lang.String): Promise[_] = js.native
  /**
           * Remove an attachment from a document.
           */
  def rmAttachment(docKey: java.lang.String, attachKey: java.lang.String): Promise[scala.Unit] = js.native
  /**
           * Set an attachment for a given document. Identified by attachKey.
           */
  def setAttachment(attachKey: java.lang.String, attachment: js.Any): Promise[scala.Unit] = js.native
  /**
           * Set an attachment for a given document. Identified by docKey and attachKey.
           */
  def setAttachment(docKey: java.lang.String, attachKey: java.lang.String, attachment: js.Any): Promise[scala.Unit] = js.native
  /**
           * Set the contents identified by docKey to data. The document will be created if it does not exist.
           */
  def setContents(docKey: java.lang.String, data: js.Any): Promise[scala.Unit] = js.native
}

