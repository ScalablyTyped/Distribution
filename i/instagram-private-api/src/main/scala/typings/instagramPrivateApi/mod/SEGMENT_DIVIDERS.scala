package typings.instagramPrivateApi.mod

import typings.instagramPrivateApi.uploadVideoOptionsMod.SegmentDivider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SEGMENT_DIVIDERS {
  
  @JSImport("instagram-private-api", "SEGMENT_DIVIDERS")
  @js.native
  val ^ : js.Any = js.native
  
  inline def sectionSize(sectionSize: js.Any): SegmentDivider = ^.asInstanceOf[js.Dynamic].applyDynamic("sectionSize")(sectionSize.asInstanceOf[js.Any]).asInstanceOf[SegmentDivider]
  
  inline def totalSections(numSections: js.Any): SegmentDivider = ^.asInstanceOf[js.Dynamic].applyDynamic("totalSections")(numSections.asInstanceOf[js.Any]).asInstanceOf[SegmentDivider]
}
