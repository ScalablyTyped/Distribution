package typings.instagramPrivateApi

import typings.instagramPrivateApi.uploadVideoOptionsMod.SegmentDivider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  object SEGMENT_DIVIDERS {
    
    @JSImport("instagram-private-api/dist/types", "SEGMENT_DIVIDERS")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def sectionSize(sectionSize: js.Any): SegmentDivider = ^.asInstanceOf[js.Dynamic].applyDynamic("sectionSize")(sectionSize.asInstanceOf[js.Any]).asInstanceOf[SegmentDivider]
    
    @scala.inline
    def totalSections(numSections: js.Any): SegmentDivider = ^.asInstanceOf[js.Dynamic].applyDynamic("totalSections")(numSections.asInstanceOf[js.Any]).asInstanceOf[SegmentDivider]
  }
}
