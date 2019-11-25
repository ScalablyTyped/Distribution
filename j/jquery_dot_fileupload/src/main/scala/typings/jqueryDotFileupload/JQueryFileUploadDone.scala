package typings.jqueryDotFileupload

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryEventObject
import typings.jquery.JQueryXHR
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryFileUploadDone
  extends JQueryFileInputOptions
     with JQueryFileUploadXhr

object JQueryFileUploadDone {
  @scala.inline
  def apply(
    errorThrown: js.Any,
    headers: StringDictionary[js.Any],
    jqXHR: JQueryXHR,
    result: js.Any,
    textStatus: String,
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
  ): JQueryFileUploadDone = {
    val __obj = js.Dynamic.literal(errorThrown = errorThrown.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], jqXHR = jqXHR.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], textStatus = textStatus.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[JQueryFileUploadDone]
  }
}

