package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A file or directory to install on the device before the test starts.
  */
@js.native
trait SchemaRegularFile extends js.Object {
  
  /**
    * Required. The source file.
    */
  var content: js.UndefOr[SchemaFileReference] = js.native
  
  /**
    * Required. Where to put the content on the device. Must be an absolute,
    * whitelisted path. If the file exists, it will be replaced. The following
    * device-side directories and any of their subdirectories are whitelisted:
    * &lt;p&gt;${EXTERNAL_STORAGE}, or /sdcard&lt;/p&gt;
    * &lt;p&gt;${ANDROID_DATA}/local/tmp, or /data/local/tmp&lt;/p&gt;
    * &lt;p&gt;Specifying a path outside of these directory trees is invalid.
    * &lt;p&gt; The paths /sdcard and /data will be made available and treated
    * as implicit path substitutions. E.g. if /sdcard on a particular device
    * does not map to external storage, the system will replace it with the
    * external storage path prefix for that device and copy the file there.
    * &lt;p&gt; It is strongly advised to use the &lt;a href=
    * &quot;http://developer.android.com/reference/android/os/Environment.html&quot;&gt;
    * Environment API&lt;/a&gt; in app and test code to access files on the
    * device in a portable way.
    */
  var devicePath: js.UndefOr[String] = js.native
}
object SchemaRegularFile {
  
  @scala.inline
  def apply(): SchemaRegularFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegularFile]
  }
  
  @scala.inline
  implicit class SchemaRegularFileOps[Self <: SchemaRegularFile] (val x: Self) extends AnyVal {
    
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
    def setContent(value: SchemaFileReference): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDevicePath(value: String): Self = this.set("devicePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevicePath: Self = this.set("devicePath", js.undefined)
  }
}
