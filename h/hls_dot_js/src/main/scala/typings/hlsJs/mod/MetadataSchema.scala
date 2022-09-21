package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MetadataSchema extends StObject
@JSImport("hls.js", "MetadataSchema")
@js.native
object MetadataSchema extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MetadataSchema & String] = js.native
  
  @js.native
  sealed trait audioId3
    extends StObject
       with MetadataSchema
  /* "org.id3" */ val audioId3: typings.hlsJs.mod.MetadataSchema.audioId3 & String = js.native
  
  @js.native
  sealed trait dateRange
    extends StObject
       with MetadataSchema
  /* "com.apple.quicktime.HLS" */ val dateRange: typings.hlsJs.mod.MetadataSchema.dateRange & String = js.native
  
  @js.native
  sealed trait emsg
    extends StObject
       with MetadataSchema
  /* "https://aomedia.org/emsg/ID3" */ val emsg: typings.hlsJs.mod.MetadataSchema.emsg & String = js.native
}
