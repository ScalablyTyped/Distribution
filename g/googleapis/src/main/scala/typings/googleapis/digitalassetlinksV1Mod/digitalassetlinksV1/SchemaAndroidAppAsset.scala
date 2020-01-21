package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes an android app asset.
  */
@js.native
trait SchemaAndroidAppAsset extends js.Object {
  /**
    * Because there is no global enforcement of package name uniqueness, we
    * also require a signing certificate, which in combination with the package
    * name uniquely identifies an app.  Some apps&#39; signing keys are
    * rotated, so they may be signed by different keys over time.  We treat
    * these as distinct assets, since we use (package name, cert) as the unique
    * ID.  This should not normally pose any problems as both versions of the
    * app will make the same or similar statements. Other assets making
    * statements about the app will have to be updated when a key is rotated,
    * however.  (Note that the syntaxes for publishing and querying for
    * statements contain syntactic sugar to easily let you specify apps that
    * are known by multiple certificates.) REQUIRED
    */
  var certificate: js.UndefOr[SchemaCertificateInfo] = js.native
  /**
    * Android App assets are naturally identified by their Java package name.
    * For example, the Google Maps app uses the package name
    * `com.google.android.apps.maps`. REQUIRED
    */
  var packageName: js.UndefOr[String] = js.native
}

object SchemaAndroidAppAsset {
  @scala.inline
  def apply(certificate: SchemaCertificateInfo = null, packageName: String = null): SchemaAndroidAppAsset = {
    val __obj = js.Dynamic.literal()
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAndroidAppAsset]
  }
}

