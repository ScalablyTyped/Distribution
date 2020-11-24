package typings.ipfsCore.touchMod

import typings.ipfsCore.ipfsCoreNumbers.`0`
import typings.ipfsCore.ipfsCoreNumbers.`1`
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchOptions extends js.Object {
  
  /**
    * - The CID version to use for any updated entries
    */
  var cidVersion: js.UndefOr[`0` | `1`] = js.native
  
  /**
    * - If true the changes will be immediately flushed to disk
    */
  var flush: js.UndefOr[Boolean] = js.native
  
  /**
    * - The hash algorithm to use for any updated entries
    */
  var hashAlg: js.UndefOr[String] = js.native
  
  /**
    * - A Date object, an object with `{ secs, nsecs }` properties where secs is the number of seconds since (positive) or before (negative) the Unix Epoch began and nsecs is the number of nanoseconds since the last full second, or the output of `process.hrtime()`
    */
  var mtime: js.UndefOr[
    Date | (js.Tuple2[Double, Double]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_format-mtime.MTime */ js.Any)
  ] = js.native
}
object TouchOptions {
  
  @scala.inline
  def apply(): TouchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchOptions]
  }
  
  @scala.inline
  implicit class TouchOptionsOps[Self <: TouchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCidVersion(value: `0` | `1`): Self = this.set("cidVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidVersion: Self = this.set("cidVersion", js.undefined)
    
    @scala.inline
    def setFlush(value: Boolean): Self = this.set("flush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlush: Self = this.set("flush", js.undefined)
    
    @scala.inline
    def setHashAlg(value: String): Self = this.set("hashAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashAlg: Self = this.set("hashAlg", js.undefined)
    
    @scala.inline
    def setMtime(
      value: Date | (js.Tuple2[Double, Double]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_format-mtime.MTime */ js.Any)
    ): Self = this.set("mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMtime: Self = this.set("mtime", js.undefined)
  }
}
