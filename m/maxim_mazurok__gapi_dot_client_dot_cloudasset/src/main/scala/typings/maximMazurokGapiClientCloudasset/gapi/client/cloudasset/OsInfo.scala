package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OsInfo extends StObject {
  
  /** The system architecture of the operating system. */
  var architecture: js.UndefOr[String] = js.native
  
  /** The VM hostname. */
  var hostname: js.UndefOr[String] = js.native
  
  /** The kernel release of the operating system. */
  var kernelRelease: js.UndefOr[String] = js.native
  
  /** The kernel version of the operating system. */
  var kernelVersion: js.UndefOr[String] = js.native
  
  /** The operating system long name. For example 'Debian GNU/Linux 9' or 'Microsoft Window Server 2019 Datacenter'. */
  var longName: js.UndefOr[String] = js.native
  
  /** The current version of the OS Config agent running on the VM. */
  var osconfigAgentVersion: js.UndefOr[String] = js.native
  
  /** The operating system short name. For example, 'windows' or 'debian'. */
  var shortName: js.UndefOr[String] = js.native
  
  /** The version of the operating system. */
  var version: js.UndefOr[String] = js.native
}
object OsInfo {
  
  @scala.inline
  def apply(): OsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OsInfo]
  }
  
  @scala.inline
  implicit class OsInfoMutableBuilder[Self <: OsInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    @scala.inline
    def setKernelRelease(value: String): Self = StObject.set(x, "kernelRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelReleaseUndefined: Self = StObject.set(x, "kernelRelease", js.undefined)
    
    @scala.inline
    def setKernelVersion(value: String): Self = StObject.set(x, "kernelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelVersionUndefined: Self = StObject.set(x, "kernelVersion", js.undefined)
    
    @scala.inline
    def setLongName(value: String): Self = StObject.set(x, "longName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongNameUndefined: Self = StObject.set(x, "longName", js.undefined)
    
    @scala.inline
    def setOsconfigAgentVersion(value: String): Self = StObject.set(x, "osconfigAgentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsconfigAgentVersionUndefined: Self = StObject.set(x, "osconfigAgentVersion", js.undefined)
    
    @scala.inline
    def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
