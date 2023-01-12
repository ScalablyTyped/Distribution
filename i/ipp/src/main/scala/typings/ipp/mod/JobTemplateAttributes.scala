package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobTemplateAttributes extends StObject {
  
  var `chamber-humidity`: js.UndefOr[Double] = js.undefined
  
  var `chamber-temperature`: js.UndefOr[Double] = js.undefined
  
  var `confirmation-sheet-print`: js.UndefOr[Boolean] = js.undefined
  
  var copies: js.UndefOr[Double] = js.undefined
  
  var `cover-back`: js.UndefOr[Cover] = js.undefined
  
  var `cover-front`: js.UndefOr[Cover] = js.undefined
  
  var `cover-sheet-info`: js.UndefOr[CoverSheetInfo] = js.undefined
  
  var `destination-uris`: js.UndefOr[js.Array[DestinationUris]] = js.undefined
  
  var finishings: js.UndefOr[js.Array[Finishings]] = js.undefined
  
  var `finishings-col`: js.UndefOr[js.Array[FinishingsInterface]] = js.undefined
  
  var `font-name-requested`: js.UndefOr[String] = js.undefined
  
  var `font-size-requested`: js.UndefOr[Double] = js.undefined
  
  var `force-front-side`: js.UndefOr[js.Array[Double]] = js.undefined
  
  var `imposition-template`: js.UndefOr[ImpositionTemplate] = js.undefined
  
  var `insert-sheet`: js.UndefOr[js.Array[InsertSheet]] = js.undefined
  
  var `job-account-id`: js.UndefOr[String] = js.undefined
  
  var `job-account-type`: js.UndefOr[JobAccountType] = js.undefined
  
  var `job-accounting-sheets`: js.UndefOr[JobAccontingSheets] = js.undefined
  
  var `job-accounting-user-id`: js.UndefOr[String] = js.undefined
  
  var `job-cancel-after`: js.UndefOr[Double] = js.undefined
  
  var `job-copies`: js.UndefOr[Double] = js.undefined
  
  var `job-cover-back`: js.UndefOr[Cover] = js.undefined
  
  var `job-cover-front`: js.UndefOr[Cover] = js.undefined
  
  var `job-delay-output-until`: js.UndefOr[JobDelayOutputUntil] = js.undefined
  
  var `job-delay-output-until-time`: js.UndefOr[String] = js.undefined
  
  var `job-error-action`: js.UndefOr[JobErrorAction] = js.undefined
  
  var `job-error-sheet`: js.UndefOr[JobErrorSheet] = js.undefined
  
  var `job-finishings`: js.UndefOr[js.Array[Finishings]] = js.undefined
  
  var `job-finishings-col`: js.UndefOr[FinishingsInterface] = js.undefined
  
  var `job-hold-until`: js.UndefOr[JobHoldUntil] = js.undefined
  
  var `job-hold-until-time`: js.UndefOr[String] = js.undefined
  
  var `job-message-to-operator`: js.UndefOr[String] = js.undefined
  
  var `job-pages-per-set`: js.UndefOr[Double] = js.undefined
  
  var `job-phone-number`: js.UndefOr[String] = js.undefined
  
  var `job-priority`: js.UndefOr[Double] = js.undefined
  
  var `job-recipient-name`: js.UndefOr[String] = js.undefined
  
  var `job-retain-until`: js.UndefOr[JobRetainUntil] = js.undefined
  
  var `job-retain-until-interval`: js.UndefOr[Double] = js.undefined
  
  var `job-retain-until-time`: js.UndefOr[String] = js.undefined
  
  var `job-save-disposition`: js.UndefOr[JobSaveDisposition] = js.undefined
  
  var `job-sheet-message`: js.UndefOr[String] = js.undefined
  
  var `job-sheets`: js.UndefOr[JobSheets] = js.undefined
  
  var `job-sheets-col`: js.UndefOr[JobSheetsInterface] = js.undefined
  
  var `materials-col`: js.UndefOr[js.Array[Materials]] = js.undefined
  
  var media: js.UndefOr[Media] = js.undefined
  
  var `media-col`: js.UndefOr[MediaInterface] = js.undefined
  
  var `media-input-tray-check`: js.UndefOr[MediaIntputTray] = js.undefined
  
  var `multiple-document-handling`: js.UndefOr[MultipleDocumentHandling] = js.undefined
  
  var `multiple-object-handling`: js.UndefOr[MultipleObjectHandling] = js.undefined
  
  var `number-of-retries`: js.UndefOr[Double] = js.undefined
  
  var `number-up`: js.UndefOr[Double] = js.undefined
  
  var `orientation-requested`: js.UndefOr[OrientationRequested] = js.undefined
  
  var `output-bin`: js.UndefOr[OutputBin] = js.undefined
  
  var `output-device`: js.UndefOr[String] = js.undefined
  
  var overrides: js.UndefOr[js.Array[Overrides]] = js.undefined
  
  var `page-delivery`: js.UndefOr[PageDelivery] = js.undefined
  
  var `page-order-received`: js.UndefOr[PageOrder] = js.undefined
  
  var `page-ranges`: js.UndefOr[String] = js.undefined
  
  var `pages-per-subset`: js.UndefOr[js.Array[Double]] = js.undefined
  
  var `pclm-source-resolution`: js.UndefOr[Resolution] = js.undefined
  
  var `pdl-init-file`: js.UndefOr[PdlInitFile] = js.undefined
  
  var `platform-temperature`: js.UndefOr[Double] = js.undefined
  
  var `presentation-direction-number-up`: js.UndefOr[PresentationDirectionNumberUp] = js.undefined
  
  var `print-accuracy`: js.UndefOr[PrintAccuracy] = js.undefined
  
  var `print-base`: js.UndefOr[PrintBase] = js.undefined
  
  var `print-color-mode`: js.UndefOr[PrintColorMode] = js.undefined
  
  var `print-content-optimize`: js.UndefOr[PrintContentOptimize] = js.undefined
  
  var `print-objects`: js.UndefOr[js.Array[PrintObjects]] = js.undefined
  
  var `print-quality`: js.UndefOr[PrintQuality] = js.undefined
  
  var `print-rendering-intent`: js.UndefOr[PrintRenderingIntent] = js.undefined
  
  var `print-scaling`: js.UndefOr[PrintScaling] = js.undefined
  
  var `print-supports`: js.UndefOr[PrintSupports] = js.undefined
  
  var `printer-resolution`: js.UndefOr[Resolution] = js.undefined
  
  var `proof-print`: js.UndefOr[ProofPrint] = js.undefined
  
  var `retry-interval`: js.UndefOr[Double] = js.undefined
  
  var `retry-time-out`: js.UndefOr[Double] = js.undefined
  
  var `separator-sheets`: js.UndefOr[SeparatorSheets] = js.undefined
  
  var sides: js.UndefOr[Sides] = js.undefined
  
  var `x-image-position`: js.UndefOr[XImagePosition] = js.undefined
  
  var `x-image-shift`: js.UndefOr[Double] = js.undefined
  
  var `x-side1-image-shift`: js.UndefOr[Double] = js.undefined
  
  var `x-side2-image-shift`: js.UndefOr[Double] = js.undefined
  
  var `y-image-position`: js.UndefOr[YImagePosition] = js.undefined
  
  var `y-image-shift`: js.UndefOr[Double] = js.undefined
  
  var `y-side1-image-shift`: js.UndefOr[Double] = js.undefined
  
  var `y-side2-image-shift`: js.UndefOr[Double] = js.undefined
}
object JobTemplateAttributes {
  
  inline def apply(): JobTemplateAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobTemplateAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobTemplateAttributes] (val x: Self) extends AnyVal {
    
    inline def `setChamber-humidity`(value: Double): Self = StObject.set(x, "chamber-humidity", value.asInstanceOf[js.Any])
    
    inline def `setChamber-humidityUndefined`: Self = StObject.set(x, "chamber-humidity", js.undefined)
    
    inline def `setChamber-temperature`(value: Double): Self = StObject.set(x, "chamber-temperature", value.asInstanceOf[js.Any])
    
    inline def `setChamber-temperatureUndefined`: Self = StObject.set(x, "chamber-temperature", js.undefined)
    
    inline def `setConfirmation-sheet-print`(value: Boolean): Self = StObject.set(x, "confirmation-sheet-print", value.asInstanceOf[js.Any])
    
    inline def `setConfirmation-sheet-printUndefined`: Self = StObject.set(x, "confirmation-sheet-print", js.undefined)
    
    inline def setCopies(value: Double): Self = StObject.set(x, "copies", value.asInstanceOf[js.Any])
    
    inline def setCopiesUndefined: Self = StObject.set(x, "copies", js.undefined)
    
    inline def `setCover-back`(value: Cover): Self = StObject.set(x, "cover-back", value.asInstanceOf[js.Any])
    
    inline def `setCover-backUndefined`: Self = StObject.set(x, "cover-back", js.undefined)
    
    inline def `setCover-front`(value: Cover): Self = StObject.set(x, "cover-front", value.asInstanceOf[js.Any])
    
    inline def `setCover-frontUndefined`: Self = StObject.set(x, "cover-front", js.undefined)
    
    inline def `setCover-sheet-info`(value: CoverSheetInfo): Self = StObject.set(x, "cover-sheet-info", value.asInstanceOf[js.Any])
    
    inline def `setCover-sheet-infoUndefined`: Self = StObject.set(x, "cover-sheet-info", js.undefined)
    
    inline def `setDestination-uris`(value: js.Array[DestinationUris]): Self = StObject.set(x, "destination-uris", value.asInstanceOf[js.Any])
    
    inline def `setDestination-urisUndefined`: Self = StObject.set(x, "destination-uris", js.undefined)
    
    inline def `setDestination-urisVarargs`(value: DestinationUris*): Self = StObject.set(x, "destination-uris", js.Array(value*))
    
    inline def setFinishings(value: js.Array[Finishings]): Self = StObject.set(x, "finishings", value.asInstanceOf[js.Any])
    
    inline def `setFinishings-col`(value: js.Array[FinishingsInterface]): Self = StObject.set(x, "finishings-col", value.asInstanceOf[js.Any])
    
    inline def `setFinishings-colUndefined`: Self = StObject.set(x, "finishings-col", js.undefined)
    
    inline def `setFinishings-colVarargs`(value: FinishingsInterface*): Self = StObject.set(x, "finishings-col", js.Array(value*))
    
    inline def setFinishingsUndefined: Self = StObject.set(x, "finishings", js.undefined)
    
    inline def setFinishingsVarargs(value: Finishings*): Self = StObject.set(x, "finishings", js.Array(value*))
    
    inline def `setFont-name-requested`(value: String): Self = StObject.set(x, "font-name-requested", value.asInstanceOf[js.Any])
    
    inline def `setFont-name-requestedUndefined`: Self = StObject.set(x, "font-name-requested", js.undefined)
    
    inline def `setFont-size-requested`(value: Double): Self = StObject.set(x, "font-size-requested", value.asInstanceOf[js.Any])
    
    inline def `setFont-size-requestedUndefined`: Self = StObject.set(x, "font-size-requested", js.undefined)
    
    inline def `setForce-front-side`(value: js.Array[Double]): Self = StObject.set(x, "force-front-side", value.asInstanceOf[js.Any])
    
    inline def `setForce-front-sideUndefined`: Self = StObject.set(x, "force-front-side", js.undefined)
    
    inline def `setForce-front-sideVarargs`(value: Double*): Self = StObject.set(x, "force-front-side", js.Array(value*))
    
    inline def `setImposition-template`(value: ImpositionTemplate): Self = StObject.set(x, "imposition-template", value.asInstanceOf[js.Any])
    
    inline def `setImposition-templateUndefined`: Self = StObject.set(x, "imposition-template", js.undefined)
    
    inline def `setInsert-sheet`(value: js.Array[InsertSheet]): Self = StObject.set(x, "insert-sheet", value.asInstanceOf[js.Any])
    
    inline def `setInsert-sheetUndefined`: Self = StObject.set(x, "insert-sheet", js.undefined)
    
    inline def `setInsert-sheetVarargs`(value: InsertSheet*): Self = StObject.set(x, "insert-sheet", js.Array(value*))
    
    inline def `setJob-account-id`(value: String): Self = StObject.set(x, "job-account-id", value.asInstanceOf[js.Any])
    
    inline def `setJob-account-idUndefined`: Self = StObject.set(x, "job-account-id", js.undefined)
    
    inline def `setJob-account-type`(value: JobAccountType): Self = StObject.set(x, "job-account-type", value.asInstanceOf[js.Any])
    
    inline def `setJob-account-typeUndefined`: Self = StObject.set(x, "job-account-type", js.undefined)
    
    inline def `setJob-accounting-sheets`(value: JobAccontingSheets): Self = StObject.set(x, "job-accounting-sheets", value.asInstanceOf[js.Any])
    
    inline def `setJob-accounting-sheetsUndefined`: Self = StObject.set(x, "job-accounting-sheets", js.undefined)
    
    inline def `setJob-accounting-user-id`(value: String): Self = StObject.set(x, "job-accounting-user-id", value.asInstanceOf[js.Any])
    
    inline def `setJob-accounting-user-idUndefined`: Self = StObject.set(x, "job-accounting-user-id", js.undefined)
    
    inline def `setJob-cancel-after`(value: Double): Self = StObject.set(x, "job-cancel-after", value.asInstanceOf[js.Any])
    
    inline def `setJob-cancel-afterUndefined`: Self = StObject.set(x, "job-cancel-after", js.undefined)
    
    inline def `setJob-copies`(value: Double): Self = StObject.set(x, "job-copies", value.asInstanceOf[js.Any])
    
    inline def `setJob-copiesUndefined`: Self = StObject.set(x, "job-copies", js.undefined)
    
    inline def `setJob-cover-back`(value: Cover): Self = StObject.set(x, "job-cover-back", value.asInstanceOf[js.Any])
    
    inline def `setJob-cover-backUndefined`: Self = StObject.set(x, "job-cover-back", js.undefined)
    
    inline def `setJob-cover-front`(value: Cover): Self = StObject.set(x, "job-cover-front", value.asInstanceOf[js.Any])
    
    inline def `setJob-cover-frontUndefined`: Self = StObject.set(x, "job-cover-front", js.undefined)
    
    inline def `setJob-delay-output-until`(value: JobDelayOutputUntil): Self = StObject.set(x, "job-delay-output-until", value.asInstanceOf[js.Any])
    
    inline def `setJob-delay-output-until-time`(value: String): Self = StObject.set(x, "job-delay-output-until-time", value.asInstanceOf[js.Any])
    
    inline def `setJob-delay-output-until-timeUndefined`: Self = StObject.set(x, "job-delay-output-until-time", js.undefined)
    
    inline def `setJob-delay-output-untilUndefined`: Self = StObject.set(x, "job-delay-output-until", js.undefined)
    
    inline def `setJob-error-action`(value: JobErrorAction): Self = StObject.set(x, "job-error-action", value.asInstanceOf[js.Any])
    
    inline def `setJob-error-actionUndefined`: Self = StObject.set(x, "job-error-action", js.undefined)
    
    inline def `setJob-error-sheet`(value: JobErrorSheet): Self = StObject.set(x, "job-error-sheet", value.asInstanceOf[js.Any])
    
    inline def `setJob-error-sheetUndefined`: Self = StObject.set(x, "job-error-sheet", js.undefined)
    
    inline def `setJob-finishings`(value: js.Array[Finishings]): Self = StObject.set(x, "job-finishings", value.asInstanceOf[js.Any])
    
    inline def `setJob-finishings-col`(value: FinishingsInterface): Self = StObject.set(x, "job-finishings-col", value.asInstanceOf[js.Any])
    
    inline def `setJob-finishings-colUndefined`: Self = StObject.set(x, "job-finishings-col", js.undefined)
    
    inline def `setJob-finishingsUndefined`: Self = StObject.set(x, "job-finishings", js.undefined)
    
    inline def `setJob-finishingsVarargs`(value: Finishings*): Self = StObject.set(x, "job-finishings", js.Array(value*))
    
    inline def `setJob-hold-until`(value: JobHoldUntil): Self = StObject.set(x, "job-hold-until", value.asInstanceOf[js.Any])
    
    inline def `setJob-hold-until-time`(value: String): Self = StObject.set(x, "job-hold-until-time", value.asInstanceOf[js.Any])
    
    inline def `setJob-hold-until-timeUndefined`: Self = StObject.set(x, "job-hold-until-time", js.undefined)
    
    inline def `setJob-hold-untilUndefined`: Self = StObject.set(x, "job-hold-until", js.undefined)
    
    inline def `setJob-message-to-operator`(value: String): Self = StObject.set(x, "job-message-to-operator", value.asInstanceOf[js.Any])
    
    inline def `setJob-message-to-operatorUndefined`: Self = StObject.set(x, "job-message-to-operator", js.undefined)
    
    inline def `setJob-pages-per-set`(value: Double): Self = StObject.set(x, "job-pages-per-set", value.asInstanceOf[js.Any])
    
    inline def `setJob-pages-per-setUndefined`: Self = StObject.set(x, "job-pages-per-set", js.undefined)
    
    inline def `setJob-phone-number`(value: String): Self = StObject.set(x, "job-phone-number", value.asInstanceOf[js.Any])
    
    inline def `setJob-phone-numberUndefined`: Self = StObject.set(x, "job-phone-number", js.undefined)
    
    inline def `setJob-priority`(value: Double): Self = StObject.set(x, "job-priority", value.asInstanceOf[js.Any])
    
    inline def `setJob-priorityUndefined`: Self = StObject.set(x, "job-priority", js.undefined)
    
    inline def `setJob-recipient-name`(value: String): Self = StObject.set(x, "job-recipient-name", value.asInstanceOf[js.Any])
    
    inline def `setJob-recipient-nameUndefined`: Self = StObject.set(x, "job-recipient-name", js.undefined)
    
    inline def `setJob-retain-until`(value: JobRetainUntil): Self = StObject.set(x, "job-retain-until", value.asInstanceOf[js.Any])
    
    inline def `setJob-retain-until-interval`(value: Double): Self = StObject.set(x, "job-retain-until-interval", value.asInstanceOf[js.Any])
    
    inline def `setJob-retain-until-intervalUndefined`: Self = StObject.set(x, "job-retain-until-interval", js.undefined)
    
    inline def `setJob-retain-until-time`(value: String): Self = StObject.set(x, "job-retain-until-time", value.asInstanceOf[js.Any])
    
    inline def `setJob-retain-until-timeUndefined`: Self = StObject.set(x, "job-retain-until-time", js.undefined)
    
    inline def `setJob-retain-untilUndefined`: Self = StObject.set(x, "job-retain-until", js.undefined)
    
    inline def `setJob-save-disposition`(value: JobSaveDisposition): Self = StObject.set(x, "job-save-disposition", value.asInstanceOf[js.Any])
    
    inline def `setJob-save-dispositionUndefined`: Self = StObject.set(x, "job-save-disposition", js.undefined)
    
    inline def `setJob-sheet-message`(value: String): Self = StObject.set(x, "job-sheet-message", value.asInstanceOf[js.Any])
    
    inline def `setJob-sheet-messageUndefined`: Self = StObject.set(x, "job-sheet-message", js.undefined)
    
    inline def `setJob-sheets`(value: JobSheets): Self = StObject.set(x, "job-sheets", value.asInstanceOf[js.Any])
    
    inline def `setJob-sheets-col`(value: JobSheetsInterface): Self = StObject.set(x, "job-sheets-col", value.asInstanceOf[js.Any])
    
    inline def `setJob-sheets-colUndefined`: Self = StObject.set(x, "job-sheets-col", js.undefined)
    
    inline def `setJob-sheetsUndefined`: Self = StObject.set(x, "job-sheets", js.undefined)
    
    inline def `setMaterials-col`(value: js.Array[Materials]): Self = StObject.set(x, "materials-col", value.asInstanceOf[js.Any])
    
    inline def `setMaterials-colUndefined`: Self = StObject.set(x, "materials-col", js.undefined)
    
    inline def `setMaterials-colVarargs`(value: Materials*): Self = StObject.set(x, "materials-col", js.Array(value*))
    
    inline def setMedia(value: Media): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def `setMedia-col`(value: MediaInterface): Self = StObject.set(x, "media-col", value.asInstanceOf[js.Any])
    
    inline def `setMedia-colUndefined`: Self = StObject.set(x, "media-col", js.undefined)
    
    inline def `setMedia-input-tray-check`(value: MediaIntputTray): Self = StObject.set(x, "media-input-tray-check", value.asInstanceOf[js.Any])
    
    inline def `setMedia-input-tray-checkUndefined`: Self = StObject.set(x, "media-input-tray-check", js.undefined)
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def `setMultiple-document-handling`(value: MultipleDocumentHandling): Self = StObject.set(x, "multiple-document-handling", value.asInstanceOf[js.Any])
    
    inline def `setMultiple-document-handlingUndefined`: Self = StObject.set(x, "multiple-document-handling", js.undefined)
    
    inline def `setMultiple-object-handling`(value: MultipleObjectHandling): Self = StObject.set(x, "multiple-object-handling", value.asInstanceOf[js.Any])
    
    inline def `setMultiple-object-handlingUndefined`: Self = StObject.set(x, "multiple-object-handling", js.undefined)
    
    inline def `setNumber-of-retries`(value: Double): Self = StObject.set(x, "number-of-retries", value.asInstanceOf[js.Any])
    
    inline def `setNumber-of-retriesUndefined`: Self = StObject.set(x, "number-of-retries", js.undefined)
    
    inline def `setNumber-up`(value: Double): Self = StObject.set(x, "number-up", value.asInstanceOf[js.Any])
    
    inline def `setNumber-upUndefined`: Self = StObject.set(x, "number-up", js.undefined)
    
    inline def `setOrientation-requested`(value: OrientationRequested): Self = StObject.set(x, "orientation-requested", value.asInstanceOf[js.Any])
    
    inline def `setOrientation-requestedUndefined`: Self = StObject.set(x, "orientation-requested", js.undefined)
    
    inline def `setOutput-bin`(value: OutputBin): Self = StObject.set(x, "output-bin", value.asInstanceOf[js.Any])
    
    inline def `setOutput-binUndefined`: Self = StObject.set(x, "output-bin", js.undefined)
    
    inline def `setOutput-device`(value: String): Self = StObject.set(x, "output-device", value.asInstanceOf[js.Any])
    
    inline def `setOutput-deviceUndefined`: Self = StObject.set(x, "output-device", js.undefined)
    
    inline def setOverrides(value: js.Array[Overrides]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: Overrides*): Self = StObject.set(x, "overrides", js.Array(value*))
    
    inline def `setPage-delivery`(value: PageDelivery): Self = StObject.set(x, "page-delivery", value.asInstanceOf[js.Any])
    
    inline def `setPage-deliveryUndefined`: Self = StObject.set(x, "page-delivery", js.undefined)
    
    inline def `setPage-order-received`(value: PageOrder): Self = StObject.set(x, "page-order-received", value.asInstanceOf[js.Any])
    
    inline def `setPage-order-receivedUndefined`: Self = StObject.set(x, "page-order-received", js.undefined)
    
    inline def `setPage-ranges`(value: String): Self = StObject.set(x, "page-ranges", value.asInstanceOf[js.Any])
    
    inline def `setPage-rangesUndefined`: Self = StObject.set(x, "page-ranges", js.undefined)
    
    inline def `setPages-per-subset`(value: js.Array[Double]): Self = StObject.set(x, "pages-per-subset", value.asInstanceOf[js.Any])
    
    inline def `setPages-per-subsetUndefined`: Self = StObject.set(x, "pages-per-subset", js.undefined)
    
    inline def `setPages-per-subsetVarargs`(value: Double*): Self = StObject.set(x, "pages-per-subset", js.Array(value*))
    
    inline def `setPclm-source-resolution`(value: Resolution): Self = StObject.set(x, "pclm-source-resolution", value.asInstanceOf[js.Any])
    
    inline def `setPclm-source-resolutionUndefined`: Self = StObject.set(x, "pclm-source-resolution", js.undefined)
    
    inline def `setPdl-init-file`(value: PdlInitFile): Self = StObject.set(x, "pdl-init-file", value.asInstanceOf[js.Any])
    
    inline def `setPdl-init-fileUndefined`: Self = StObject.set(x, "pdl-init-file", js.undefined)
    
    inline def `setPlatform-temperature`(value: Double): Self = StObject.set(x, "platform-temperature", value.asInstanceOf[js.Any])
    
    inline def `setPlatform-temperatureUndefined`: Self = StObject.set(x, "platform-temperature", js.undefined)
    
    inline def `setPresentation-direction-number-up`(value: PresentationDirectionNumberUp): Self = StObject.set(x, "presentation-direction-number-up", value.asInstanceOf[js.Any])
    
    inline def `setPresentation-direction-number-upUndefined`: Self = StObject.set(x, "presentation-direction-number-up", js.undefined)
    
    inline def `setPrint-accuracy`(value: PrintAccuracy): Self = StObject.set(x, "print-accuracy", value.asInstanceOf[js.Any])
    
    inline def `setPrint-accuracyUndefined`: Self = StObject.set(x, "print-accuracy", js.undefined)
    
    inline def `setPrint-base`(value: PrintBase): Self = StObject.set(x, "print-base", value.asInstanceOf[js.Any])
    
    inline def `setPrint-baseUndefined`: Self = StObject.set(x, "print-base", js.undefined)
    
    inline def `setPrint-color-mode`(value: PrintColorMode): Self = StObject.set(x, "print-color-mode", value.asInstanceOf[js.Any])
    
    inline def `setPrint-color-modeUndefined`: Self = StObject.set(x, "print-color-mode", js.undefined)
    
    inline def `setPrint-content-optimize`(value: PrintContentOptimize): Self = StObject.set(x, "print-content-optimize", value.asInstanceOf[js.Any])
    
    inline def `setPrint-content-optimizeUndefined`: Self = StObject.set(x, "print-content-optimize", js.undefined)
    
    inline def `setPrint-objects`(value: js.Array[PrintObjects]): Self = StObject.set(x, "print-objects", value.asInstanceOf[js.Any])
    
    inline def `setPrint-objectsUndefined`: Self = StObject.set(x, "print-objects", js.undefined)
    
    inline def `setPrint-objectsVarargs`(value: PrintObjects*): Self = StObject.set(x, "print-objects", js.Array(value*))
    
    inline def `setPrint-quality`(value: PrintQuality): Self = StObject.set(x, "print-quality", value.asInstanceOf[js.Any])
    
    inline def `setPrint-qualityUndefined`: Self = StObject.set(x, "print-quality", js.undefined)
    
    inline def `setPrint-rendering-intent`(value: PrintRenderingIntent): Self = StObject.set(x, "print-rendering-intent", value.asInstanceOf[js.Any])
    
    inline def `setPrint-rendering-intentUndefined`: Self = StObject.set(x, "print-rendering-intent", js.undefined)
    
    inline def `setPrint-scaling`(value: PrintScaling): Self = StObject.set(x, "print-scaling", value.asInstanceOf[js.Any])
    
    inline def `setPrint-scalingUndefined`: Self = StObject.set(x, "print-scaling", js.undefined)
    
    inline def `setPrint-supports`(value: PrintSupports): Self = StObject.set(x, "print-supports", value.asInstanceOf[js.Any])
    
    inline def `setPrint-supportsUndefined`: Self = StObject.set(x, "print-supports", js.undefined)
    
    inline def `setPrinter-resolution`(value: Resolution): Self = StObject.set(x, "printer-resolution", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-resolutionUndefined`: Self = StObject.set(x, "printer-resolution", js.undefined)
    
    inline def `setProof-print`(value: ProofPrint): Self = StObject.set(x, "proof-print", value.asInstanceOf[js.Any])
    
    inline def `setProof-printUndefined`: Self = StObject.set(x, "proof-print", js.undefined)
    
    inline def `setRetry-interval`(value: Double): Self = StObject.set(x, "retry-interval", value.asInstanceOf[js.Any])
    
    inline def `setRetry-intervalUndefined`: Self = StObject.set(x, "retry-interval", js.undefined)
    
    inline def `setRetry-time-out`(value: Double): Self = StObject.set(x, "retry-time-out", value.asInstanceOf[js.Any])
    
    inline def `setRetry-time-outUndefined`: Self = StObject.set(x, "retry-time-out", js.undefined)
    
    inline def `setSeparator-sheets`(value: SeparatorSheets): Self = StObject.set(x, "separator-sheets", value.asInstanceOf[js.Any])
    
    inline def `setSeparator-sheetsUndefined`: Self = StObject.set(x, "separator-sheets", js.undefined)
    
    inline def setSides(value: Sides): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
    
    inline def setSidesUndefined: Self = StObject.set(x, "sides", js.undefined)
    
    inline def `setX-image-position`(value: XImagePosition): Self = StObject.set(x, "x-image-position", value.asInstanceOf[js.Any])
    
    inline def `setX-image-positionUndefined`: Self = StObject.set(x, "x-image-position", js.undefined)
    
    inline def `setX-image-shift`(value: Double): Self = StObject.set(x, "x-image-shift", value.asInstanceOf[js.Any])
    
    inline def `setX-image-shiftUndefined`: Self = StObject.set(x, "x-image-shift", js.undefined)
    
    inline def `setX-side1-image-shift`(value: Double): Self = StObject.set(x, "x-side1-image-shift", value.asInstanceOf[js.Any])
    
    inline def `setX-side1-image-shiftUndefined`: Self = StObject.set(x, "x-side1-image-shift", js.undefined)
    
    inline def `setX-side2-image-shift`(value: Double): Self = StObject.set(x, "x-side2-image-shift", value.asInstanceOf[js.Any])
    
    inline def `setX-side2-image-shiftUndefined`: Self = StObject.set(x, "x-side2-image-shift", js.undefined)
    
    inline def `setY-image-position`(value: YImagePosition): Self = StObject.set(x, "y-image-position", value.asInstanceOf[js.Any])
    
    inline def `setY-image-positionUndefined`: Self = StObject.set(x, "y-image-position", js.undefined)
    
    inline def `setY-image-shift`(value: Double): Self = StObject.set(x, "y-image-shift", value.asInstanceOf[js.Any])
    
    inline def `setY-image-shiftUndefined`: Self = StObject.set(x, "y-image-shift", js.undefined)
    
    inline def `setY-side1-image-shift`(value: Double): Self = StObject.set(x, "y-side1-image-shift", value.asInstanceOf[js.Any])
    
    inline def `setY-side1-image-shiftUndefined`: Self = StObject.set(x, "y-side1-image-shift", js.undefined)
    
    inline def `setY-side2-image-shift`(value: Double): Self = StObject.set(x, "y-side2-image-shift", value.asInstanceOf[js.Any])
    
    inline def `setY-side2-image-shiftUndefined`: Self = StObject.set(x, "y-side2-image-shift", js.undefined)
  }
}
