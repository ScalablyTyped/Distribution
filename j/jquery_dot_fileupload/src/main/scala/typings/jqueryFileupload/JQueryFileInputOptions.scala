package typings.jqueryFileupload

import typings.jquery.JQueryEventObject
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interface options for the plugin
@js.native
trait JQueryFileInputOptions extends js.Object {
  var active: js.UndefOr[js.Function] = js.native
  /**
    * The add callback is invoked as soon as files are added to the fileupload
    * widget (via file input selection, drag & drop, paste or add API call).
    * If the singleFileUploads option is enabled, this callback will be
    * called once for each file in the selection for XHR file uploads, else
    * once for each file selection.
    *
    * The upload starts when the submit method is invoked on the data parameter.
    * The data object contains a files property holding the added files
    * and allows you to override plugin options as well as define ajax settings.
    *
    * Listeners for this callback can also be bound the following way:
    * .bind('fileuploadadd', func);
    *
    * data.submit() returns a Promise object and allows to attach additional
    * handlers using jQuery's Deferred callbacks:
    * data.submit().done(func).fail(func).always(func);
    */
  var add: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JqueryFileUploadAddObject, Unit]
  ] = js.native
  var always: js.UndefOr[js.Function2[/* e */ JQueryEventObject, /* data */ this.type, Unit]] = js.native
  /**
    * By default, uploads are started automatically when adding files:
    */
  var autoUpload: js.UndefOr[Boolean] = js.native
  /**
    * Interval in milliseconds to calculate progress bitrate:
    */
  var bitrateInterval: js.UndefOr[Double] = js.native
  var cache: js.UndefOr[Boolean] = js.native
  var change: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChangeObject, Unit]
  ] = js.native
  var chunkalways: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.native
  var chunkdone: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.native
  var chunkfail: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.native
  var chunksend: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.native
  var contentType: js.UndefOr[String] = js.native
  /**
    * The type of data that is expected back from the server.
    */
  var dataType: js.UndefOr[String] = js.native
  var done: js.UndefOr[js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone, Unit]] = js.native
  var dragover: js.UndefOr[js.Function1[/* e */ JQueryEventObject, Unit]] = js.native
  var drop: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject, Unit]
  ] = js.native
  /**
    * The drop target element(s), by the default the complete document.
    * Set to null to disable drag & drop support:
    */
  var dropZone: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.native
  var fail: js.UndefOr[js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone, Unit]] = js.native
  /**
    * The file input field(s), that are listened to for change events.
    * If undefined, it is set to the file input fields inside
    * of the widget element on plugin initialization.
    * Set to null to disable the change listener.
    */
  var fileInput: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.native
  var files: js.UndefOr[js.Any] = js.native
  /**
    * Set the following option to true to force iframe transport uploads:
    */
  var forceIframeTransport: js.UndefOr[Boolean] = js.native
  /**
    * Additional form data to be sent along with the file uploads can be set
    * using this option, which accepts an array of objects with name and
    * value properties, a function returning such an array, a FormData
    * object (for XHR file uploads), or a simple object.
    * The form of the first fileInput is given as parameter to the function:
    */
  var formData: js.UndefOr[js.Any] = js.native
  /**
    * Translation function, gets the message key to be translated
    * and an object with context specific data as arguments:
    */
  var i18n: js.UndefOr[js.Any] = js.native
  /**
    * To limit the number of concurrent uploads,
    * set the following option to an integer greater than 0:
    */
  var limitConcurrentUploads: js.UndefOr[Double] = js.native
  /**
    * The following option limits the number of files uploaded with one
    * XHR request to keep the request size under or equal to the defined
    * limit in bytes
    */
  var limitMultiFileUploadSize: js.UndefOr[Double] = js.native
  /**
    * Multipart file uploads add a number of bytes to each uploaded file,
    * therefore the following option adds an overhead for each file used
    * in the limitMultiFileUploadSize configuration:
    */
  var limitMultiFileUploadSizeOverhead: js.UndefOr[Double] = js.native
  /**
    * To limit the number of files uploaded with one XHR request,
    * set the following option to an integer greater than 0:
    */
  var limitMultiFileUploads: js.UndefOr[Double] = js.native
  /**
    * To upload large files in smaller chunks, set the following option
    * to a preferred maximum chunk size. If set to 0, null or undefined,
    * or the browser does not support the required Blob API, files will
    * be uploaded as a whole.
    */
  var maxChunkSize: js.UndefOr[Double] = js.native
  // Validation
  /**
    * The maximum allowed file size in bytes.
    * Type: integer
    * Default: undefined
    * Example: 10000000 // 10 MB
    * Note: This option has only an effect for browsers supporting the File API.
    * @see https://github.com/blueimp/jQuery-File-Upload/wiki/Options#maxfilesize
    */
  var maxFileSize: js.UndefOr[Double] = js.native
  /**
    * Error and info messages:
    */
  var messages: js.UndefOr[js.Any] = js.native
  /**
    * By default, XHR file uploads are sent as multipart/form-data.
    * The iframe transport is always using multipart/form-data.
    * Set to false to enable non-multipart XHR uploads:
    */
  var multipart: js.UndefOr[Boolean] = js.native
  /**
    * The parameter name for the file form data (the request argument name).
    * If undefined or empty, the name property of the file input field is
    * used, or "files[]" if the file input name property is also empty,
    * can be a string or an array of strings:
    */
  var paramName: js.UndefOr[js.Any] = js.native
  var paste: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject, Unit]
  ] = js.native
  /**
    * The paste target element(s), by the default the complete document.
    * Set to null to disable paste support:
    */
  var pasteZone: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.native
  /**
    * Set the following option to the location of a postMessage window,
    * to enable postMessage transport uploads:
    */
  var postMessage: js.UndefOr[String] = js.native
  // The plugin options are used as settings object for the ajax calls.
  // The following are jQuery ajax settings required for the file uploads:
  var processData: js.UndefOr[Boolean] = js.native
  var progress: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject, Unit]
  ] = js.native
  /**
    * Interval in milliseconds to calculate and trigger progress events:
    */
  var progressInterval: js.UndefOr[Double] = js.native
  var progressall: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressAllObject, Unit]
  ] = js.native
  /**
    * By default, failed (abort or error) file uploads are removed from the
    * global progress calculation. Set the following option to false to
    * prevent recalculating the global progress data:
    */
  var recalculateProgress: js.UndefOr[Boolean] = js.native
  /**
    * Set the following option to the location of a redirect url on the
    * origin server, for cross-domain iframe transport uploads:
    */
  var redirect: js.UndefOr[String] = js.native
  /**
    * The parameter name for the redirect url, sent as part of the form
    * data and set to 'redirect' if this option is empty:
    */
  var redirectParamName: js.UndefOr[String] = js.native
  /**
    * By default, the file input field is replaced with a clone after
    * each input field change event. This is required for iframe transport
    * queues and allows change events to be fired for the same file
    * selection, but can be disabled by setting the following option to false:
    */
  var replaceFileInput: js.UndefOr[Boolean] = js.native
  var send: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject, Unit]
  ] = js.native
  /**
    * Set the following option to true to issue all file upload requests
    * in a sequential order:
    */
  var sequentialUploads: js.UndefOr[Boolean] = js.native
  /**
    * By default, each file of a selection is uploaded using an individual
    * request for XHR type uploads. Set to false to upload file
    * selections in one request each:
    */
  var singleFileUploads: js.UndefOr[Boolean] = js.native
  var start: js.UndefOr[js.Function1[/* e */ JQueryEventObject, Unit]] = js.native
  var stop: js.UndefOr[js.Function1[/* e */ JQueryEventObject, Unit]] = js.native
  // Other callbacks:
  var submit: js.UndefOr[js.Function] = js.native
  var timeout: js.UndefOr[Double] = js.native
  // The HTTP request method must be "POST" or "PUT"
  var `type`: js.UndefOr[String] = js.native
  /**
    * When a non-multipart upload or a chunked multipart upload has been
    * aborted, this option can be used to resume the upload by setting
    * it to the size of the already uploaded bytes. This option is most
    * useful when modifying the options object inside of the "add" or
    * "send" callbacks, as the options are cloned for each file upload.
    */
  var uploadedBytes: js.UndefOr[Double] = js.native
  // Others
  var url: js.UndefOr[String] = js.native
  // Cross-site XMLHttpRequest file uploads
  var xhrFields: js.UndefOr[js.Any] = js.native
}

object JQueryFileInputOptions {
  @scala.inline
  def apply(): JQueryFileInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryFileInputOptions]
  }
  @scala.inline
  implicit class JQueryFileInputOptionsOps[Self <: JQueryFileInputOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: js.Function): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAdd(value: (/* e */ JQueryEventObject, /* data */ JqueryFileUploadAddObject) => Unit): Self = this.set("add", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setAlways(value: (/* e */ JQueryEventObject, JQueryFileInputOptions) => Unit): Self = this.set("always", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAlways: Self = this.set("always", js.undefined)
    @scala.inline
    def setAutoUpload(value: Boolean): Self = this.set("autoUpload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoUpload: Self = this.set("autoUpload", js.undefined)
    @scala.inline
    def setBitrateInterval(value: Double): Self = this.set("bitrateInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitrateInterval: Self = this.set("bitrateInterval", js.undefined)
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setChange(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChangeObject) => Unit): Self = this.set("change", js.Any.fromFunction2(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setChunkalways(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Unit): Self = this.set("chunkalways", js.Any.fromFunction2(value))
    @scala.inline
    def deleteChunkalways: Self = this.set("chunkalways", js.undefined)
    @scala.inline
    def setChunkdone(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Unit): Self = this.set("chunkdone", js.Any.fromFunction2(value))
    @scala.inline
    def deleteChunkdone: Self = this.set("chunkdone", js.undefined)
    @scala.inline
    def setChunkfail(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Unit): Self = this.set("chunkfail", js.Any.fromFunction2(value))
    @scala.inline
    def deleteChunkfail: Self = this.set("chunkfail", js.undefined)
    @scala.inline
    def setChunksend(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Unit): Self = this.set("chunksend", js.Any.fromFunction2(value))
    @scala.inline
    def deleteChunksend: Self = this.set("chunksend", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setDone(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone) => Unit): Self = this.set("done", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    @scala.inline
    def setDragover(value: /* e */ JQueryEventObject => Unit): Self = this.set("dragover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragover: Self = this.set("dragover", js.undefined)
    @scala.inline
    def setDrop(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject) => Unit): Self = this.set("drop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    @scala.inline
    def setDropZoneVarargs(value: Element*): Self = this.set("dropZone", js.Array(value :_*))
    @scala.inline
    def setDropZone(value: Element | js.Array[Element] | JQuery | String): Self = this.set("dropZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropZone: Self = this.set("dropZone", js.undefined)
    @scala.inline
    def setFail(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone) => Unit): Self = this.set("fail", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setFileInputVarargs(value: Element*): Self = this.set("fileInput", js.Array(value :_*))
    @scala.inline
    def setFileInput(value: Element | js.Array[Element] | JQuery | String): Self = this.set("fileInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileInput: Self = this.set("fileInput", js.undefined)
    @scala.inline
    def setFiles(value: js.Any): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setForceIframeTransport(value: Boolean): Self = this.set("forceIframeTransport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceIframeTransport: Self = this.set("forceIframeTransport", js.undefined)
    @scala.inline
    def setFormData(value: js.Any): Self = this.set("formData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormData: Self = this.set("formData", js.undefined)
    @scala.inline
    def setI18n(value: js.Any): Self = this.set("i18n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    @scala.inline
    def setLimitConcurrentUploads(value: Double): Self = this.set("limitConcurrentUploads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitConcurrentUploads: Self = this.set("limitConcurrentUploads", js.undefined)
    @scala.inline
    def setLimitMultiFileUploadSize(value: Double): Self = this.set("limitMultiFileUploadSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitMultiFileUploadSize: Self = this.set("limitMultiFileUploadSize", js.undefined)
    @scala.inline
    def setLimitMultiFileUploadSizeOverhead(value: Double): Self = this.set("limitMultiFileUploadSizeOverhead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitMultiFileUploadSizeOverhead: Self = this.set("limitMultiFileUploadSizeOverhead", js.undefined)
    @scala.inline
    def setLimitMultiFileUploads(value: Double): Self = this.set("limitMultiFileUploads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitMultiFileUploads: Self = this.set("limitMultiFileUploads", js.undefined)
    @scala.inline
    def setMaxChunkSize(value: Double): Self = this.set("maxChunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxChunkSize: Self = this.set("maxChunkSize", js.undefined)
    @scala.inline
    def setMaxFileSize(value: Double): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFileSize: Self = this.set("maxFileSize", js.undefined)
    @scala.inline
    def setMessages(value: js.Any): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setMultipart(value: Boolean): Self = this.set("multipart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipart: Self = this.set("multipart", js.undefined)
    @scala.inline
    def setParamName(value: js.Any): Self = this.set("paramName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParamName: Self = this.set("paramName", js.undefined)
    @scala.inline
    def setPaste(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject) => Unit): Self = this.set("paste", js.Any.fromFunction2(value))
    @scala.inline
    def deletePaste: Self = this.set("paste", js.undefined)
    @scala.inline
    def setPasteZoneVarargs(value: Element*): Self = this.set("pasteZone", js.Array(value :_*))
    @scala.inline
    def setPasteZone(value: Element | js.Array[Element] | JQuery | String): Self = this.set("pasteZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasteZone: Self = this.set("pasteZone", js.undefined)
    @scala.inline
    def setPostMessage(value: String): Self = this.set("postMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostMessage: Self = this.set("postMessage", js.undefined)
    @scala.inline
    def setProcessData(value: Boolean): Self = this.set("processData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessData: Self = this.set("processData", js.undefined)
    @scala.inline
    def setProgress(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject) => Unit): Self = this.set("progress", js.Any.fromFunction2(value))
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setProgressInterval(value: Double): Self = this.set("progressInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressInterval: Self = this.set("progressInterval", js.undefined)
    @scala.inline
    def setProgressall(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressAllObject) => Unit): Self = this.set("progressall", js.Any.fromFunction2(value))
    @scala.inline
    def deleteProgressall: Self = this.set("progressall", js.undefined)
    @scala.inline
    def setRecalculateProgress(value: Boolean): Self = this.set("recalculateProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecalculateProgress: Self = this.set("recalculateProgress", js.undefined)
    @scala.inline
    def setRedirect(value: String): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    @scala.inline
    def setRedirectParamName(value: String): Self = this.set("redirectParamName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectParamName: Self = this.set("redirectParamName", js.undefined)
    @scala.inline
    def setReplaceFileInput(value: Boolean): Self = this.set("replaceFileInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceFileInput: Self = this.set("replaceFileInput", js.undefined)
    @scala.inline
    def setSend(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject) => Unit): Self = this.set("send", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSend: Self = this.set("send", js.undefined)
    @scala.inline
    def setSequentialUploads(value: Boolean): Self = this.set("sequentialUploads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSequentialUploads: Self = this.set("sequentialUploads", js.undefined)
    @scala.inline
    def setSingleFileUploads(value: Boolean): Self = this.set("singleFileUploads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleFileUploads: Self = this.set("singleFileUploads", js.undefined)
    @scala.inline
    def setStart(value: /* e */ JQueryEventObject => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStop(value: /* e */ JQueryEventObject => Unit): Self = this.set("stop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    @scala.inline
    def setSubmit(value: js.Function): Self = this.set("submit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmit: Self = this.set("submit", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUploadedBytes(value: Double): Self = this.set("uploadedBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadedBytes: Self = this.set("uploadedBytes", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setXhrFields(value: js.Any): Self = this.set("xhrFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhrFields: Self = this.set("xhrFields", js.undefined)
  }
  
}

