package typings.jqueryDotFileupload

import typings.jquery.JQueryEventObject
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interface options for the plugin
trait JQueryFileInputOptions extends js.Object {
  var active: js.UndefOr[js.Function] = js.undefined
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
  ] = js.undefined
  var always: js.UndefOr[js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileInputOptions, Unit]] = js.undefined
  /**
    * By default, uploads are started automatically when adding files:
    */
  var autoUpload: js.UndefOr[Boolean] = js.undefined
  /**
    * Interval in milliseconds to calculate progress bitrate:
    */
  var bitrateInterval: js.UndefOr[Double] = js.undefined
  var cache: js.UndefOr[Boolean] = js.undefined
  var change: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChangeObject, Unit]
  ] = js.undefined
  var chunkalways: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.undefined
  var chunkdone: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.undefined
  var chunkfail: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.undefined
  var chunksend: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  /**
    * The type of data that is expected back from the server.
    */
  var dataType: js.UndefOr[String] = js.undefined
  var done: js.UndefOr[js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone, Unit]] = js.undefined
  var dragover: js.UndefOr[js.Function1[/* e */ JQueryEventObject, Unit]] = js.undefined
  var drop: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject, Unit]
  ] = js.undefined
  /**
    * The drop target element(s), by the default the complete document.
    * Set to null to disable drag & drop support:
    */
  var dropZone: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.undefined
  var fail: js.UndefOr[js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone, Unit]] = js.undefined
  /**
    * The file input field(s), that are listened to for change events.
    * If undefined, it is set to the file input fields inside
    * of the widget element on plugin initialization.
    * Set to null to disable the change listener.
    */
  var fileInput: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.undefined
  var files: js.UndefOr[js.Any] = js.undefined
  /**
    * Set the following option to true to force iframe transport uploads:
    */
  var forceIframeTransport: js.UndefOr[Boolean] = js.undefined
  /**
    * Additional form data to be sent along with the file uploads can be set
    * using this option, which accepts an array of objects with name and
    * value properties, a function returning such an array, a FormData
    * object (for XHR file uploads), or a simple object.
    * The form of the first fileInput is given as parameter to the function:
    */
  var formData: js.UndefOr[js.Any] = js.undefined
  /**
    * Translation function, gets the message key to be translated
    * and an object with context specific data as arguments:
    */
  var i18n: js.UndefOr[js.Any] = js.undefined
  /**
    * To limit the number of concurrent uploads,
    * set the following option to an integer greater than 0:
    */
  var limitConcurrentUploads: js.UndefOr[Double] = js.undefined
  /**
    * The following option limits the number of files uploaded with one
    * XHR request to keep the request size under or equal to the defined
    * limit in bytes
    */
  var limitMultiFileUploadSize: js.UndefOr[Double] = js.undefined
  /**
    * Multipart file uploads add a number of bytes to each uploaded file,
    * therefore the following option adds an overhead for each file used
    * in the limitMultiFileUploadSize configuration:
    */
  var limitMultiFileUploadSizeOverhead: js.UndefOr[Double] = js.undefined
  /**
    * To limit the number of files uploaded with one XHR request,
    * set the following option to an integer greater than 0:
    */
  var limitMultiFileUploads: js.UndefOr[Double] = js.undefined
  /**
    * To upload large files in smaller chunks, set the following option
    * to a preferred maximum chunk size. If set to 0, null or undefined,
    * or the browser does not support the required Blob API, files will
    * be uploaded as a whole.
    */
  var maxChunkSize: js.UndefOr[Double] = js.undefined
  // Validation
  /**
    * The maximum allowed file size in bytes.
    * Type: integer
    * Default: undefined
    * Example: 10000000 // 10 MB
    * Note: This option has only an effect for browsers supporting the File API.
    * @see https://github.com/blueimp/jQuery-File-Upload/wiki/Options#maxfilesize
    */
  var maxFileSize: js.UndefOr[Double] = js.undefined
  /**
    * Error and info messages:
    */
  var messages: js.UndefOr[js.Any] = js.undefined
  /**
    * By default, XHR file uploads are sent as multipart/form-data.
    * The iframe transport is always using multipart/form-data.
    * Set to false to enable non-multipart XHR uploads:
    */
  var multipart: js.UndefOr[Boolean] = js.undefined
  /**
    * The parameter name for the file form data (the request argument name).
    * If undefined or empty, the name property of the file input field is
    * used, or "files[]" if the file input name property is also empty,
    * can be a string or an array of strings:
    */
  var paramName: js.UndefOr[js.Any] = js.undefined
  var paste: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject, Unit]
  ] = js.undefined
  /**
    * The paste target element(s), by the default the complete document.
    * Set to null to disable paste support:
    */
  var pasteZone: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.undefined
  /**
    * Set the following option to the location of a postMessage window,
    * to enable postMessage transport uploads:
    */
  var postMessage: js.UndefOr[String] = js.undefined
  // The plugin options are used as settings object for the ajax calls.
  // The following are jQuery ajax settings required for the file uploads:
  var processData: js.UndefOr[Boolean] = js.undefined
  var progress: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject, Unit]
  ] = js.undefined
  /**
    * Interval in milliseconds to calculate and trigger progress events:
    */
  var progressInterval: js.UndefOr[Double] = js.undefined
  var progressall: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressAllObject, Unit]
  ] = js.undefined
  /**
    * By default, failed (abort or error) file uploads are removed from the
    * global progress calculation. Set the following option to false to
    * prevent recalculating the global progress data:
    */
  var recalculateProgress: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the following option to the location of a redirect url on the
    * origin server, for cross-domain iframe transport uploads:
    */
  var redirect: js.UndefOr[String] = js.undefined
  /**
    * The parameter name for the redirect url, sent as part of the form
    * data and set to 'redirect' if this option is empty:
    */
  var redirectParamName: js.UndefOr[String] = js.undefined
  /**
    * By default, the file input field is replaced with a clone after
    * each input field change event. This is required for iframe transport
    * queues and allows change events to be fired for the same file
    * selection, but can be disabled by setting the following option to false:
    */
  var replaceFileInput: js.UndefOr[Boolean] = js.undefined
  var send: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject, Unit]
  ] = js.undefined
  /**
    * Set the following option to true to issue all file upload requests
    * in a sequential order:
    */
  var sequentialUploads: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, each file of a selection is uploaded using an individual
    * request for XHR type uploads. Set to false to upload file
    * selections in one request each:
    */
  var singleFileUploads: js.UndefOr[Boolean] = js.undefined
  var start: js.UndefOr[js.Function1[/* e */ JQueryEventObject, Unit]] = js.undefined
  var stop: js.UndefOr[js.Function1[/* e */ JQueryEventObject, Unit]] = js.undefined
  // Other callbacks:
  var submit: js.UndefOr[js.Function] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  // The HTTP request method must be "POST" or "PUT"
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * When a non-multipart upload or a chunked multipart upload has been
    * aborted, this option can be used to resume the upload by setting
    * it to the size of the already uploaded bytes. This option is most
    * useful when modifying the options object inside of the "add" or
    * "send" callbacks, as the options are cloned for each file upload.
    */
  var uploadedBytes: js.UndefOr[Double] = js.undefined
  // Others
  var url: js.UndefOr[String] = js.undefined
  // Cross-site XMLHttpRequest file uploads
  var xhrFields: js.UndefOr[js.Any] = js.undefined
}

object JQueryFileInputOptions {
  @scala.inline
  def apply(
    active: js.Function = null,
    add: (/* e */ JQueryEventObject, /* data */ JqueryFileUploadAddObject) => Unit = null,
    always: (/* e */ JQueryEventObject, /* data */ JQueryFileInputOptions) => Unit = null,
    autoUpload: js.UndefOr[Boolean] = js.undefined,
    bitrateInterval: Int | Double = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    change: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChangeObject) => Unit = null,
    chunkalways: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Unit = null,
    chunkdone: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Unit = null,
    chunkfail: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Unit = null,
    chunksend: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Unit = null,
    contentType: String = null,
    dataType: String = null,
    done: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone) => Unit = null,
    dragover: /* e */ JQueryEventObject => Unit = null,
    drop: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject) => Unit = null,
    dropZone: Element | js.Array[Element] | JQuery | String = null,
    fail: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone) => Unit = null,
    fileInput: Element | js.Array[Element] | JQuery | String = null,
    files: js.Any = null,
    forceIframeTransport: js.UndefOr[Boolean] = js.undefined,
    formData: js.Any = null,
    i18n: js.Any = null,
    limitConcurrentUploads: Int | Double = null,
    limitMultiFileUploadSize: Int | Double = null,
    limitMultiFileUploadSizeOverhead: Int | Double = null,
    limitMultiFileUploads: Int | Double = null,
    maxChunkSize: Int | Double = null,
    maxFileSize: Int | Double = null,
    messages: js.Any = null,
    multipart: js.UndefOr[Boolean] = js.undefined,
    paramName: js.Any = null,
    paste: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject) => Unit = null,
    pasteZone: Element | js.Array[Element] | JQuery | String = null,
    postMessage: String = null,
    processData: js.UndefOr[Boolean] = js.undefined,
    progress: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject) => Unit = null,
    progressInterval: Int | Double = null,
    progressall: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressAllObject) => Unit = null,
    recalculateProgress: js.UndefOr[Boolean] = js.undefined,
    redirect: String = null,
    redirectParamName: String = null,
    replaceFileInput: js.UndefOr[Boolean] = js.undefined,
    send: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject) => Unit = null,
    sequentialUploads: js.UndefOr[Boolean] = js.undefined,
    singleFileUploads: js.UndefOr[Boolean] = js.undefined,
    start: /* e */ JQueryEventObject => Unit = null,
    stop: /* e */ JQueryEventObject => Unit = null,
    submit: js.Function = null,
    timeout: Int | Double = null,
    `type`: String = null,
    uploadedBytes: Int | Double = null,
    url: String = null,
    xhrFields: js.Any = null
  ): JQueryFileInputOptions = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction2(add))
    if (always != null) __obj.updateDynamic("always")(js.Any.fromFunction2(always))
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload.asInstanceOf[js.Any])
    if (bitrateInterval != null) __obj.updateDynamic("bitrateInterval")(bitrateInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (chunkalways != null) __obj.updateDynamic("chunkalways")(js.Any.fromFunction2(chunkalways))
    if (chunkdone != null) __obj.updateDynamic("chunkdone")(js.Any.fromFunction2(chunkdone))
    if (chunkfail != null) __obj.updateDynamic("chunkfail")(js.Any.fromFunction2(chunkfail))
    if (chunksend != null) __obj.updateDynamic("chunksend")(js.Any.fromFunction2(chunksend))
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction2(done))
    if (dragover != null) __obj.updateDynamic("dragover")(js.Any.fromFunction1(dragover))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction2(drop))
    if (dropZone != null) __obj.updateDynamic("dropZone")(dropZone.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction2(fail))
    if (fileInput != null) __obj.updateDynamic("fileInput")(fileInput.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIframeTransport)) __obj.updateDynamic("forceIframeTransport")(forceIframeTransport.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (limitConcurrentUploads != null) __obj.updateDynamic("limitConcurrentUploads")(limitConcurrentUploads.asInstanceOf[js.Any])
    if (limitMultiFileUploadSize != null) __obj.updateDynamic("limitMultiFileUploadSize")(limitMultiFileUploadSize.asInstanceOf[js.Any])
    if (limitMultiFileUploadSizeOverhead != null) __obj.updateDynamic("limitMultiFileUploadSizeOverhead")(limitMultiFileUploadSizeOverhead.asInstanceOf[js.Any])
    if (limitMultiFileUploads != null) __obj.updateDynamic("limitMultiFileUploads")(limitMultiFileUploads.asInstanceOf[js.Any])
    if (maxChunkSize != null) __obj.updateDynamic("maxChunkSize")(maxChunkSize.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(multipart)) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (paramName != null) __obj.updateDynamic("paramName")(paramName.asInstanceOf[js.Any])
    if (paste != null) __obj.updateDynamic("paste")(js.Any.fromFunction2(paste))
    if (pasteZone != null) __obj.updateDynamic("pasteZone")(pasteZone.asInstanceOf[js.Any])
    if (postMessage != null) __obj.updateDynamic("postMessage")(postMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(processData)) __obj.updateDynamic("processData")(processData.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction2(progress))
    if (progressInterval != null) __obj.updateDynamic("progressInterval")(progressInterval.asInstanceOf[js.Any])
    if (progressall != null) __obj.updateDynamic("progressall")(js.Any.fromFunction2(progressall))
    if (!js.isUndefined(recalculateProgress)) __obj.updateDynamic("recalculateProgress")(recalculateProgress.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (redirectParamName != null) __obj.updateDynamic("redirectParamName")(redirectParamName.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceFileInput)) __obj.updateDynamic("replaceFileInput")(replaceFileInput.asInstanceOf[js.Any])
    if (send != null) __obj.updateDynamic("send")(js.Any.fromFunction2(send))
    if (!js.isUndefined(sequentialUploads)) __obj.updateDynamic("sequentialUploads")(sequentialUploads.asInstanceOf[js.Any])
    if (!js.isUndefined(singleFileUploads)) __obj.updateDynamic("singleFileUploads")(singleFileUploads.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    if (submit != null) __obj.updateDynamic("submit")(submit.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uploadedBytes != null) __obj.updateDynamic("uploadedBytes")(uploadedBytes.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (xhrFields != null) __obj.updateDynamic("xhrFields")(xhrFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryFileInputOptions]
  }
}

