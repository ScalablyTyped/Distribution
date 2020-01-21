package typings.googleapis.mirrorV1Mod.mirrorV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/mirror/v1", "mirror_v1.Resource$Timeline$Attachments")
@js.native
class ResourceTimelineAttachments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * mirror.timeline.attachments.delete
    * @desc Deletes an attachment from a timeline item.
    * @alias mirror.timeline.attachments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.attachmentId The ID of the attachment.
    * @param {string} params.itemId The ID of the timeline item the attachment belongs to.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceTimelineAttachmentsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTimelineAttachmentsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceTimelineAttachmentsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceTimelineAttachmentsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceTimelineAttachmentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * mirror.timeline.attachments.get
    * @desc Retrieves an attachment on a timeline item by item ID and
    * attachment ID.
    * @alias mirror.timeline.attachments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.attachmentId The ID of the attachment.
    * @param {string} params.itemId The ID of the timeline item the attachment belongs to.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAttachment] = js.native
  def get(callback: BodyResponseCallback[SchemaAttachment]): Unit = js.native
  def get(params: ParamsResourceTimelineAttachmentsGet): GaxiosPromise[SchemaAttachment] = js.native
  def get(params: ParamsResourceTimelineAttachmentsGet, callback: BodyResponseCallback[SchemaAttachment]): Unit = js.native
  def get(
    params: ParamsResourceTimelineAttachmentsGet,
    options: BodyResponseCallback[SchemaAttachment],
    callback: BodyResponseCallback[SchemaAttachment]
  ): Unit = js.native
  def get(params: ParamsResourceTimelineAttachmentsGet, options: MethodOptions): GaxiosPromise[SchemaAttachment] = js.native
  def get(
    params: ParamsResourceTimelineAttachmentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAttachment]
  ): Unit = js.native
  /**
    * mirror.timeline.attachments.insert
    * @desc Adds a new attachment to a timeline item.
    * @alias mirror.timeline.attachments.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.itemId The ID of the timeline item the attachment belongs to.
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaAttachment] = js.native
  def insert(callback: BodyResponseCallback[SchemaAttachment]): Unit = js.native
  def insert(params: ParamsResourceTimelineAttachmentsInsert): GaxiosPromise[SchemaAttachment] = js.native
  def insert(params: ParamsResourceTimelineAttachmentsInsert, callback: BodyResponseCallback[SchemaAttachment]): Unit = js.native
  def insert(
    params: ParamsResourceTimelineAttachmentsInsert,
    options: BodyResponseCallback[SchemaAttachment],
    callback: BodyResponseCallback[SchemaAttachment]
  ): Unit = js.native
  def insert(params: ParamsResourceTimelineAttachmentsInsert, options: MethodOptions): GaxiosPromise[SchemaAttachment] = js.native
  def insert(
    params: ParamsResourceTimelineAttachmentsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAttachment]
  ): Unit = js.native
  /**
    * mirror.timeline.attachments.list
    * @desc Returns a list of attachments for a timeline item.
    * @alias mirror.timeline.attachments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.itemId The ID of the timeline item whose attachments should be listed.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAttachmentsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAttachmentsListResponse]): Unit = js.native
  def list(params: ParamsResourceTimelineAttachmentsList): GaxiosPromise[SchemaAttachmentsListResponse] = js.native
  def list(
    params: ParamsResourceTimelineAttachmentsList,
    callback: BodyResponseCallback[SchemaAttachmentsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceTimelineAttachmentsList,
    options: BodyResponseCallback[SchemaAttachmentsListResponse],
    callback: BodyResponseCallback[SchemaAttachmentsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTimelineAttachmentsList, options: MethodOptions): GaxiosPromise[SchemaAttachmentsListResponse] = js.native
  def list(
    params: ParamsResourceTimelineAttachmentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAttachmentsListResponse]
  ): Unit = js.native
}

