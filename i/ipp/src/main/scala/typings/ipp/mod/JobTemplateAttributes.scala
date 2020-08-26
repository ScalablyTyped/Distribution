package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobTemplateAttributes extends js.Object {
  var `chamber-humidity`: js.UndefOr[Double] = js.native
  var `chamber-temperature`: js.UndefOr[Double] = js.native
  var `confirmation-sheet-print`: js.UndefOr[Boolean] = js.native
  var copies: js.UndefOr[Double] = js.native
  var `cover-back`: js.UndefOr[Cover] = js.native
  var `cover-front`: js.UndefOr[Cover] = js.native
  var `cover-sheet-info`: js.UndefOr[CoverSheetInfo] = js.native
  var `destination-uris`: js.UndefOr[js.Array[DestinationUris]] = js.native
  var finishings: js.UndefOr[js.Array[Finishings]] = js.native
  var `finishings-col`: js.UndefOr[js.Array[FinishingsInterface]] = js.native
  var `font-name-requested`: js.UndefOr[String] = js.native
  var `font-size-requested`: js.UndefOr[Double] = js.native
  var `force-front-side`: js.UndefOr[js.Array[Double]] = js.native
  var `imposition-template`: js.UndefOr[ImpositionTemplate] = js.native
  var `insert-sheet`: js.UndefOr[js.Array[InsertSheet]] = js.native
  var `job-account-id`: js.UndefOr[String] = js.native
  var `job-account-type`: js.UndefOr[JobAccountType] = js.native
  var `job-accounting-sheets`: js.UndefOr[JobAccontingSheets] = js.native
  var `job-accounting-user-id`: js.UndefOr[String] = js.native
  var `job-cancel-after`: js.UndefOr[Double] = js.native
  var `job-copies`: js.UndefOr[Double] = js.native
  var `job-cover-back`: js.UndefOr[Cover] = js.native
  var `job-cover-front`: js.UndefOr[Cover] = js.native
  var `job-delay-output-until`: js.UndefOr[JobDelayOutputUntil] = js.native
  var `job-delay-output-until-time`: js.UndefOr[String] = js.native
  var `job-error-action`: js.UndefOr[JobErrorAction] = js.native
  var `job-error-sheet`: js.UndefOr[JobErrorSheet] = js.native
  var `job-finishings`: js.UndefOr[js.Array[Finishings]] = js.native
  var `job-finishings-col`: js.UndefOr[FinishingsInterface] = js.native
  var `job-hold-until`: js.UndefOr[JobHoldUntil] = js.native
  var `job-hold-until-time`: js.UndefOr[String] = js.native
  var `job-message-to-operator`: js.UndefOr[String] = js.native
  var `job-pages-per-set`: js.UndefOr[Double] = js.native
  var `job-phone-number`: js.UndefOr[String] = js.native
  var `job-priority`: js.UndefOr[Double] = js.native
  var `job-recipient-name`: js.UndefOr[String] = js.native
  var `job-retain-until`: js.UndefOr[JobRetainUntil] = js.native
  var `job-retain-until-interval`: js.UndefOr[Double] = js.native
  var `job-retain-until-time`: js.UndefOr[String] = js.native
  var `job-save-disposition`: js.UndefOr[JobSaveDisposition] = js.native
  var `job-sheet-message`: js.UndefOr[String] = js.native
  var `job-sheets`: js.UndefOr[JobSheets] = js.native
  var `job-sheets-col`: js.UndefOr[JobSheetsInterface] = js.native
  var `materials-col`: js.UndefOr[js.Array[Materials]] = js.native
  var media: js.UndefOr[Media] = js.native
  var `media-col`: js.UndefOr[MediaInterface] = js.native
  var `media-input-tray-check`: js.UndefOr[MediaIntputTray] = js.native
  var `multiple-document-handling`: js.UndefOr[MultipleDocumentHandling] = js.native
  var `multiple-object-handling`: js.UndefOr[MultipleObjectHandling] = js.native
  var `number-of-retries`: js.UndefOr[Double] = js.native
  var `number-up`: js.UndefOr[Double] = js.native
  var `orientation-requested`: js.UndefOr[OrientationRequested] = js.native
  var `output-bin`: js.UndefOr[OutputBin] = js.native
  var `output-device`: js.UndefOr[String] = js.native
  var overrides: js.UndefOr[js.Array[Overrides]] = js.native
  var `page-delivery`: js.UndefOr[PageDelivery] = js.native
  var `page-order-received`: js.UndefOr[PageOrder] = js.native
  var `page-ranges`: js.UndefOr[String] = js.native
  var `pages-per-subset`: js.UndefOr[js.Array[Double]] = js.native
  var `pclm-source-resolution`: js.UndefOr[Resolution] = js.native
  var `pdl-init-file`: js.UndefOr[PdlInitFile] = js.native
  var `platform-temperature`: js.UndefOr[Double] = js.native
  var `presentation-direction-number-up`: js.UndefOr[PresentationDirectionNumberUp] = js.native
  var `print-accuracy`: js.UndefOr[PrintAccuracy] = js.native
  var `print-base`: js.UndefOr[PrintBase] = js.native
  var `print-color-mode`: js.UndefOr[PrintColorMode] = js.native
  var `print-content-optimize`: js.UndefOr[PrintContentOptimize] = js.native
  var `print-objects`: js.UndefOr[js.Array[PrintObjects]] = js.native
  var `print-quality`: js.UndefOr[PrintQuality] = js.native
  var `print-rendering-intent`: js.UndefOr[PrintRenderingIntent] = js.native
  var `print-scaling`: js.UndefOr[PrintScaling] = js.native
  var `print-supports`: js.UndefOr[PrintSupports] = js.native
  var `printer-resolution`: js.UndefOr[Resolution] = js.native
  var `proof-print`: js.UndefOr[ProofPrint] = js.native
  var `retry-interval`: js.UndefOr[Double] = js.native
  var `retry-time-out`: js.UndefOr[Double] = js.native
  var `separator-sheets`: js.UndefOr[SeparatorSheets] = js.native
  var sides: js.UndefOr[Sides] = js.native
  var `x-image-position`: js.UndefOr[XImagePosition] = js.native
  var `x-image-shift`: js.UndefOr[Double] = js.native
  var `x-side1-image-shift`: js.UndefOr[Double] = js.native
  var `x-side2-image-shift`: js.UndefOr[Double] = js.native
  var `y-image-position`: js.UndefOr[YImagePosition] = js.native
  var `y-image-shift`: js.UndefOr[Double] = js.native
  var `y-side1-image-shift`: js.UndefOr[Double] = js.native
  var `y-side2-image-shift`: js.UndefOr[Double] = js.native
}

object JobTemplateAttributes {
  @scala.inline
  def apply(): JobTemplateAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobTemplateAttributes]
  }
  @scala.inline
  implicit class JobTemplateAttributesOps[Self <: JobTemplateAttributes] (val x: Self) extends AnyVal {
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
    def `setChamber-humidity`(value: Double): Self = this.set("chamber-humidity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteChamber-humidity`: Self = this.set("chamber-humidity", js.undefined)
    @scala.inline
    def `setChamber-temperature`(value: Double): Self = this.set("chamber-temperature", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteChamber-temperature`: Self = this.set("chamber-temperature", js.undefined)
    @scala.inline
    def `setConfirmation-sheet-print`(value: Boolean): Self = this.set("confirmation-sheet-print", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteConfirmation-sheet-print`: Self = this.set("confirmation-sheet-print", js.undefined)
    @scala.inline
    def setCopies(value: Double): Self = this.set("copies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopies: Self = this.set("copies", js.undefined)
    @scala.inline
    def `setCover-back`(value: Cover): Self = this.set("cover-back", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCover-back`: Self = this.set("cover-back", js.undefined)
    @scala.inline
    def `setCover-front`(value: Cover): Self = this.set("cover-front", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCover-front`: Self = this.set("cover-front", js.undefined)
    @scala.inline
    def `setCover-sheet-info`(value: CoverSheetInfo): Self = this.set("cover-sheet-info", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCover-sheet-info`: Self = this.set("cover-sheet-info", js.undefined)
    @scala.inline
    def `setDestination-urisVarargs`(value: DestinationUris*): Self = this.set("destination-uris", js.Array(value :_*))
    @scala.inline
    def `setDestination-uris`(value: js.Array[DestinationUris]): Self = this.set("destination-uris", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDestination-uris`: Self = this.set("destination-uris", js.undefined)
    @scala.inline
    def setFinishingsVarargs(value: Finishings*): Self = this.set("finishings", js.Array(value :_*))
    @scala.inline
    def setFinishings(value: js.Array[Finishings]): Self = this.set("finishings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinishings: Self = this.set("finishings", js.undefined)
    @scala.inline
    def `setFinishings-colVarargs`(value: FinishingsInterface*): Self = this.set("finishings-col", js.Array(value :_*))
    @scala.inline
    def `setFinishings-col`(value: js.Array[FinishingsInterface]): Self = this.set("finishings-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFinishings-col`: Self = this.set("finishings-col", js.undefined)
    @scala.inline
    def `setFont-name-requested`(value: String): Self = this.set("font-name-requested", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-name-requested`: Self = this.set("font-name-requested", js.undefined)
    @scala.inline
    def `setFont-size-requested`(value: Double): Self = this.set("font-size-requested", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-size-requested`: Self = this.set("font-size-requested", js.undefined)
    @scala.inline
    def `setForce-front-sideVarargs`(value: Double*): Self = this.set("force-front-side", js.Array(value :_*))
    @scala.inline
    def `setForce-front-side`(value: js.Array[Double]): Self = this.set("force-front-side", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteForce-front-side`: Self = this.set("force-front-side", js.undefined)
    @scala.inline
    def `setImposition-template`(value: ImpositionTemplate): Self = this.set("imposition-template", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteImposition-template`: Self = this.set("imposition-template", js.undefined)
    @scala.inline
    def `setInsert-sheetVarargs`(value: InsertSheet*): Self = this.set("insert-sheet", js.Array(value :_*))
    @scala.inline
    def `setInsert-sheet`(value: js.Array[InsertSheet]): Self = this.set("insert-sheet", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInsert-sheet`: Self = this.set("insert-sheet", js.undefined)
    @scala.inline
    def `setJob-account-id`(value: String): Self = this.set("job-account-id", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-account-id`: Self = this.set("job-account-id", js.undefined)
    @scala.inline
    def `setJob-account-type`(value: JobAccountType): Self = this.set("job-account-type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-account-type`: Self = this.set("job-account-type", js.undefined)
    @scala.inline
    def `setJob-accounting-sheets`(value: JobAccontingSheets): Self = this.set("job-accounting-sheets", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-accounting-sheets`: Self = this.set("job-accounting-sheets", js.undefined)
    @scala.inline
    def `setJob-accounting-user-id`(value: String): Self = this.set("job-accounting-user-id", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-accounting-user-id`: Self = this.set("job-accounting-user-id", js.undefined)
    @scala.inline
    def `setJob-cancel-after`(value: Double): Self = this.set("job-cancel-after", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-cancel-after`: Self = this.set("job-cancel-after", js.undefined)
    @scala.inline
    def `setJob-copies`(value: Double): Self = this.set("job-copies", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-copies`: Self = this.set("job-copies", js.undefined)
    @scala.inline
    def `setJob-cover-back`(value: Cover): Self = this.set("job-cover-back", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-cover-back`: Self = this.set("job-cover-back", js.undefined)
    @scala.inline
    def `setJob-cover-front`(value: Cover): Self = this.set("job-cover-front", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-cover-front`: Self = this.set("job-cover-front", js.undefined)
    @scala.inline
    def `setJob-delay-output-until`(value: JobDelayOutputUntil): Self = this.set("job-delay-output-until", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-delay-output-until`: Self = this.set("job-delay-output-until", js.undefined)
    @scala.inline
    def `setJob-delay-output-until-time`(value: String): Self = this.set("job-delay-output-until-time", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-delay-output-until-time`: Self = this.set("job-delay-output-until-time", js.undefined)
    @scala.inline
    def `setJob-error-action`(value: JobErrorAction): Self = this.set("job-error-action", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-error-action`: Self = this.set("job-error-action", js.undefined)
    @scala.inline
    def `setJob-error-sheet`(value: JobErrorSheet): Self = this.set("job-error-sheet", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-error-sheet`: Self = this.set("job-error-sheet", js.undefined)
    @scala.inline
    def `setJob-finishingsVarargs`(value: Finishings*): Self = this.set("job-finishings", js.Array(value :_*))
    @scala.inline
    def `setJob-finishings`(value: js.Array[Finishings]): Self = this.set("job-finishings", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-finishings`: Self = this.set("job-finishings", js.undefined)
    @scala.inline
    def `setJob-finishings-col`(value: FinishingsInterface): Self = this.set("job-finishings-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-finishings-col`: Self = this.set("job-finishings-col", js.undefined)
    @scala.inline
    def `setJob-hold-until`(value: JobHoldUntil): Self = this.set("job-hold-until", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-hold-until`: Self = this.set("job-hold-until", js.undefined)
    @scala.inline
    def `setJob-hold-until-time`(value: String): Self = this.set("job-hold-until-time", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-hold-until-time`: Self = this.set("job-hold-until-time", js.undefined)
    @scala.inline
    def `setJob-message-to-operator`(value: String): Self = this.set("job-message-to-operator", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-message-to-operator`: Self = this.set("job-message-to-operator", js.undefined)
    @scala.inline
    def `setJob-pages-per-set`(value: Double): Self = this.set("job-pages-per-set", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-pages-per-set`: Self = this.set("job-pages-per-set", js.undefined)
    @scala.inline
    def `setJob-phone-number`(value: String): Self = this.set("job-phone-number", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-phone-number`: Self = this.set("job-phone-number", js.undefined)
    @scala.inline
    def `setJob-priority`(value: Double): Self = this.set("job-priority", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-priority`: Self = this.set("job-priority", js.undefined)
    @scala.inline
    def `setJob-recipient-name`(value: String): Self = this.set("job-recipient-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-recipient-name`: Self = this.set("job-recipient-name", js.undefined)
    @scala.inline
    def `setJob-retain-until`(value: JobRetainUntil): Self = this.set("job-retain-until", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-retain-until`: Self = this.set("job-retain-until", js.undefined)
    @scala.inline
    def `setJob-retain-until-interval`(value: Double): Self = this.set("job-retain-until-interval", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-retain-until-interval`: Self = this.set("job-retain-until-interval", js.undefined)
    @scala.inline
    def `setJob-retain-until-time`(value: String): Self = this.set("job-retain-until-time", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-retain-until-time`: Self = this.set("job-retain-until-time", js.undefined)
    @scala.inline
    def `setJob-save-disposition`(value: JobSaveDisposition): Self = this.set("job-save-disposition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-save-disposition`: Self = this.set("job-save-disposition", js.undefined)
    @scala.inline
    def `setJob-sheet-message`(value: String): Self = this.set("job-sheet-message", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-sheet-message`: Self = this.set("job-sheet-message", js.undefined)
    @scala.inline
    def `setJob-sheets`(value: JobSheets): Self = this.set("job-sheets", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-sheets`: Self = this.set("job-sheets", js.undefined)
    @scala.inline
    def `setJob-sheets-col`(value: JobSheetsInterface): Self = this.set("job-sheets-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-sheets-col`: Self = this.set("job-sheets-col", js.undefined)
    @scala.inline
    def `setMaterials-colVarargs`(value: Materials*): Self = this.set("materials-col", js.Array(value :_*))
    @scala.inline
    def `setMaterials-col`(value: js.Array[Materials]): Self = this.set("materials-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterials-col`: Self = this.set("materials-col", js.undefined)
    @scala.inline
    def setMedia(value: Media): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def `setMedia-col`(value: MediaInterface): Self = this.set("media-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-col`: Self = this.set("media-col", js.undefined)
    @scala.inline
    def `setMedia-input-tray-check`(value: MediaIntputTray): Self = this.set("media-input-tray-check", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-input-tray-check`: Self = this.set("media-input-tray-check", js.undefined)
    @scala.inline
    def `setMultiple-document-handling`(value: MultipleDocumentHandling): Self = this.set("multiple-document-handling", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMultiple-document-handling`: Self = this.set("multiple-document-handling", js.undefined)
    @scala.inline
    def `setMultiple-object-handling`(value: MultipleObjectHandling): Self = this.set("multiple-object-handling", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMultiple-object-handling`: Self = this.set("multiple-object-handling", js.undefined)
    @scala.inline
    def `setNumber-of-retries`(value: Double): Self = this.set("number-of-retries", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNumber-of-retries`: Self = this.set("number-of-retries", js.undefined)
    @scala.inline
    def `setNumber-up`(value: Double): Self = this.set("number-up", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNumber-up`: Self = this.set("number-up", js.undefined)
    @scala.inline
    def `setOrientation-requested`(value: OrientationRequested): Self = this.set("orientation-requested", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOrientation-requested`: Self = this.set("orientation-requested", js.undefined)
    @scala.inline
    def `setOutput-bin`(value: OutputBin): Self = this.set("output-bin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-bin`: Self = this.set("output-bin", js.undefined)
    @scala.inline
    def `setOutput-device`(value: String): Self = this.set("output-device", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-device`: Self = this.set("output-device", js.undefined)
    @scala.inline
    def setOverridesVarargs(value: Overrides*): Self = this.set("overrides", js.Array(value :_*))
    @scala.inline
    def setOverrides(value: js.Array[Overrides]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def `setPage-delivery`(value: PageDelivery): Self = this.set("page-delivery", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePage-delivery`: Self = this.set("page-delivery", js.undefined)
    @scala.inline
    def `setPage-order-received`(value: PageOrder): Self = this.set("page-order-received", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePage-order-received`: Self = this.set("page-order-received", js.undefined)
    @scala.inline
    def `setPage-ranges`(value: String): Self = this.set("page-ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePage-ranges`: Self = this.set("page-ranges", js.undefined)
    @scala.inline
    def `setPages-per-subsetVarargs`(value: Double*): Self = this.set("pages-per-subset", js.Array(value :_*))
    @scala.inline
    def `setPages-per-subset`(value: js.Array[Double]): Self = this.set("pages-per-subset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePages-per-subset`: Self = this.set("pages-per-subset", js.undefined)
    @scala.inline
    def `setPclm-source-resolution`(value: Resolution): Self = this.set("pclm-source-resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePclm-source-resolution`: Self = this.set("pclm-source-resolution", js.undefined)
    @scala.inline
    def `setPdl-init-file`(value: PdlInitFile): Self = this.set("pdl-init-file", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePdl-init-file`: Self = this.set("pdl-init-file", js.undefined)
    @scala.inline
    def `setPlatform-temperature`(value: Double): Self = this.set("platform-temperature", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePlatform-temperature`: Self = this.set("platform-temperature", js.undefined)
    @scala.inline
    def `setPresentation-direction-number-up`(value: PresentationDirectionNumberUp): Self = this.set("presentation-direction-number-up", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePresentation-direction-number-up`: Self = this.set("presentation-direction-number-up", js.undefined)
    @scala.inline
    def `setPrint-accuracy`(value: PrintAccuracy): Self = this.set("print-accuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-accuracy`: Self = this.set("print-accuracy", js.undefined)
    @scala.inline
    def `setPrint-base`(value: PrintBase): Self = this.set("print-base", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-base`: Self = this.set("print-base", js.undefined)
    @scala.inline
    def `setPrint-color-mode`(value: PrintColorMode): Self = this.set("print-color-mode", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-color-mode`: Self = this.set("print-color-mode", js.undefined)
    @scala.inline
    def `setPrint-content-optimize`(value: PrintContentOptimize): Self = this.set("print-content-optimize", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-content-optimize`: Self = this.set("print-content-optimize", js.undefined)
    @scala.inline
    def `setPrint-objectsVarargs`(value: PrintObjects*): Self = this.set("print-objects", js.Array(value :_*))
    @scala.inline
    def `setPrint-objects`(value: js.Array[PrintObjects]): Self = this.set("print-objects", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-objects`: Self = this.set("print-objects", js.undefined)
    @scala.inline
    def `setPrint-quality`(value: PrintQuality): Self = this.set("print-quality", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-quality`: Self = this.set("print-quality", js.undefined)
    @scala.inline
    def `setPrint-rendering-intent`(value: PrintRenderingIntent): Self = this.set("print-rendering-intent", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-rendering-intent`: Self = this.set("print-rendering-intent", js.undefined)
    @scala.inline
    def `setPrint-scaling`(value: PrintScaling): Self = this.set("print-scaling", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-scaling`: Self = this.set("print-scaling", js.undefined)
    @scala.inline
    def `setPrint-supports`(value: PrintSupports): Self = this.set("print-supports", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-supports`: Self = this.set("print-supports", js.undefined)
    @scala.inline
    def `setPrinter-resolution`(value: Resolution): Self = this.set("printer-resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-resolution`: Self = this.set("printer-resolution", js.undefined)
    @scala.inline
    def `setProof-print`(value: ProofPrint): Self = this.set("proof-print", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteProof-print`: Self = this.set("proof-print", js.undefined)
    @scala.inline
    def `setRetry-interval`(value: Double): Self = this.set("retry-interval", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRetry-interval`: Self = this.set("retry-interval", js.undefined)
    @scala.inline
    def `setRetry-time-out`(value: Double): Self = this.set("retry-time-out", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRetry-time-out`: Self = this.set("retry-time-out", js.undefined)
    @scala.inline
    def `setSeparator-sheets`(value: SeparatorSheets): Self = this.set("separator-sheets", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSeparator-sheets`: Self = this.set("separator-sheets", js.undefined)
    @scala.inline
    def setSides(value: Sides): Self = this.set("sides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSides: Self = this.set("sides", js.undefined)
    @scala.inline
    def `setX-image-position`(value: XImagePosition): Self = this.set("x-image-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-image-position`: Self = this.set("x-image-position", js.undefined)
    @scala.inline
    def `setX-image-shift`(value: Double): Self = this.set("x-image-shift", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-image-shift`: Self = this.set("x-image-shift", js.undefined)
    @scala.inline
    def `setX-side1-image-shift`(value: Double): Self = this.set("x-side1-image-shift", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-side1-image-shift`: Self = this.set("x-side1-image-shift", js.undefined)
    @scala.inline
    def `setX-side2-image-shift`(value: Double): Self = this.set("x-side2-image-shift", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-side2-image-shift`: Self = this.set("x-side2-image-shift", js.undefined)
    @scala.inline
    def `setY-image-position`(value: YImagePosition): Self = this.set("y-image-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-image-position`: Self = this.set("y-image-position", js.undefined)
    @scala.inline
    def `setY-image-shift`(value: Double): Self = this.set("y-image-shift", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-image-shift`: Self = this.set("y-image-shift", js.undefined)
    @scala.inline
    def `setY-side1-image-shift`(value: Double): Self = this.set("y-side1-image-shift", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-side1-image-shift`: Self = this.set("y-side1-image-shift", js.undefined)
    @scala.inline
    def `setY-side2-image-shift`(value: Double): Self = this.set("y-side2-image-shift", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-side2-image-shift`: Self = this.set("y-side2-image-shift", js.undefined)
  }
  
}

