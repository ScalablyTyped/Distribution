package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a web asset.
  */
@js.native
trait SchemaWebAsset extends js.Object {
  /**
    * Web assets are identified by a URL that contains only the scheme,
    * hostname and port parts.  The format is
    * http[s]://&lt;hostname&gt;[:&lt;port&gt;]  Hostnames must be fully
    * qualified: they must end in a single period (&quot;`.`&quot;).  Only the
    * schemes &quot;http&quot; and &quot;https&quot; are currently allowed.
    * Port numbers are given as a decimal number, and they must be omitted if
    * the standard port numbers are used: 80 for http and 443 for https.  We
    * call this limited URL the &quot;site&quot;.  All URLs that share the same
    * scheme, hostname and port are considered to be a part of the site and
    * thus belong to the web asset.  Example: the asset with the site
    * `https://www.google.com` contains all these URLs:    *
    * `https://www.google.com/`   *   `https://www.google.com:443/`   *
    * `https://www.google.com/foo`   *   `https://www.google.com/foo?bar`   *
    * `https://www.google.com/foo#bar`   *
    * `https://user@password:www.google.com/`  But it does not contain these
    * URLs:    *   `http://www.google.com/`       (wrong scheme)   *
    * `https://google.com/`          (hostname does not match)   *
    * `https://www.google.com:444/`  (port does not match) REQUIRED
    */
  var site: js.UndefOr[String] = js.native
}

object SchemaWebAsset {
  @scala.inline
  def apply(site: String = null): SchemaWebAsset = {
    val __obj = js.Dynamic.literal()
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWebAsset]
  }
}

