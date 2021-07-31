package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Version extends StObject {
  
  /** Used to correct mistakes in the version numbering scheme. */
  var epoch: js.UndefOr[Double] = js.undefined
  
  /** Required. Distinguishes between sentinel MIN/MAX versions and normal versions. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Required only when version kind is NORMAL. The main part of the version name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The iteration of the package build from the above version. */
  var revision: js.UndefOr[String] = js.undefined
}
object Version {
  
  @scala.inline
  def apply(): Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Version]
  }
  
  @scala.inline
  implicit class VersionMutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEpoch(value: Double): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpochUndefined: Self = StObject.set(x, "epoch", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
  }
}
