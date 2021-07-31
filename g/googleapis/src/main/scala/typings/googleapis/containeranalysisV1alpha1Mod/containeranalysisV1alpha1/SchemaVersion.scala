package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Version contains structured information about the version of the package.
  * For a discussion of this in Debian/Ubuntu:
  * http://serverfault.com/questions/604541/debian-packages-version-convention
  * For a discussion of this in Redhat/Fedora/Centos:
  * http://blog.jasonantman.com/2014/07/how-yum-and-rpm-compare-versions/
  */
trait SchemaVersion extends StObject {
  
  /**
    * Used to correct mistakes in the version numbering scheme.
    */
  var epoch: js.UndefOr[Double] = js.undefined
  
  /**
    * Distinguish between sentinel MIN/MAX versions and normal versions. If
    * kind is not NORMAL, then the other fields are ignored.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The main part of the version name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The iteration of the package build from the above version.
    */
  var revision: js.UndefOr[String] = js.undefined
}
object SchemaVersion {
  
  @scala.inline
  def apply(): SchemaVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersion]
  }
  
  @scala.inline
  implicit class SchemaVersionMutableBuilder[Self <: SchemaVersion] (val x: Self) extends AnyVal {
    
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
