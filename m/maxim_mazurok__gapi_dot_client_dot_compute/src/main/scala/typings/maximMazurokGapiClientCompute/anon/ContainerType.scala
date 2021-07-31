package typings.maximMazurokGapiClientCompute.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerType extends StObject {
  
  /**
    * The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime format. Provided by the client
    * when the disk image is created.
    */
  var containerType: js.UndefOr[String] = js.undefined
  
  /** [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created. */
  var sha1Checksum: js.UndefOr[String] = js.undefined
  
  /** The full Google Cloud Storage URL where the disk image is stored. You must provide either this property or the sourceDisk property but not both. */
  var source: js.UndefOr[String] = js.undefined
}
object ContainerType {
  
  @scala.inline
  def apply(): ContainerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerType]
  }
  
  @scala.inline
  implicit class ContainerTypeMutableBuilder[Self <: ContainerType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerType(value: String): Self = StObject.set(x, "containerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerTypeUndefined: Self = StObject.set(x, "containerType", js.undefined)
    
    @scala.inline
    def setSha1Checksum(value: String): Self = StObject.set(x, "sha1Checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1ChecksumUndefined: Self = StObject.set(x, "sha1Checksum", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
