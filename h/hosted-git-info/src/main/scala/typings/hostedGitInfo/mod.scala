package typings.hostedGitInfo

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hosted-git-info", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with GitHost {
    def this(`type`: Hosts, user: String, auth: String, project: String) = this()
    def this(`type`: Hosts, user: String, auth: Unit, project: String) = this()
    def this(`type`: Hosts, user: String, auth: String, project: String, committish: String) = this()
    def this(`type`: Hosts, user: String, auth: Unit, project: String, committish: String) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: String,
      project: String,
      committish: String,
      defaultRepresentation: Representation
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: String,
      project: String,
      committish: Unit,
      defaultRepresentation: Representation
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: Unit,
      project: String,
      committish: String,
      defaultRepresentation: Representation
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: Unit,
      project: String,
      committish: Unit,
      defaultRepresentation: Representation
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: String,
      project: String,
      committish: String,
      defaultRepresentation: Unit,
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: String,
      project: String,
      committish: String,
      defaultRepresentation: Representation,
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: String,
      project: String,
      committish: Unit,
      defaultRepresentation: Unit,
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: String,
      project: String,
      committish: Unit,
      defaultRepresentation: Representation,
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: Unit,
      project: String,
      committish: String,
      defaultRepresentation: Unit,
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: Unit,
      project: String,
      committish: String,
      defaultRepresentation: Representation,
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: Unit,
      project: String,
      committish: Unit,
      defaultRepresentation: Unit,
      opts: FillOptions
    ) = this()
    def this(
      `type`: Hosts,
      user: String,
      auth: Unit,
      project: String,
      committish: Unit,
      defaultRepresentation: Representation,
      opts: FillOptions
    ) = this()
  }
  @JSImport("hosted-git-info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromUrl(gitUrl: String): js.UndefOr[GitHost] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(gitUrl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[GitHost]]
  inline def fromUrl(gitUrl: String, opts: Options): js.UndefOr[GitHost] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(gitUrl.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[GitHost]]
  
  trait FillOptions
    extends StObject
       with Options {
    
    var auth: js.UndefOr[String] = js.undefined
    
    var committish: js.UndefOr[String] = js.undefined
    
    var fragment: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var treepath: js.UndefOr[String] = js.undefined
  }
  object FillOptions {
    
    inline def apply(): FillOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FillOptions]
    }
    
    extension [Self <: FillOptions](x: Self) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setCommittish(value: String): Self = StObject.set(x, "committish", value.asInstanceOf[js.Any])
      
      inline def setCommittishUndefined: Self = StObject.set(x, "committish", js.undefined)
      
      inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTreepath(value: String): Self = StObject.set(x, "treepath", value.asInstanceOf[js.Any])
      
      inline def setTreepathUndefined: Self = StObject.set(x, "treepath", js.undefined)
    }
  }
  
  @js.native
  trait GitHost extends StObject {
    
    var default: js.UndefOr[String] = js.native
    
    var auth: js.UndefOr[String] = js.native
    
    def browse(): String = js.native
    def browse(opts: FillOptions): String = js.native
    def browse(path: String): String = js.native
    def browse(path: String, fragment: String): String = js.native
    def browse(path: String, fragment: String, opts: FillOptions): String = js.native
    def browse(path: String, opts: FillOptions): String = js.native
    
    var browsefiletemplate: String = js.native
    
    var browsetemplate: String = js.native
    
    def bugs(): String = js.native
    def bugs(opts: FillOptions): String = js.native
    
    var bugstemplate: String = js.native
    
    var committish: js.UndefOr[String] = js.native
    
    def docs(): String = js.native
    def docs(opts: FillOptions): String = js.native
    
    var docstemplate: String = js.native
    
    var domain: String = js.native
    
    def file(path: String): String = js.native
    def file(path: String, opts: FillOptions): String = js.native
    
    var filetemplate: String = js.native
    
    def getDefaultRepresentation(): js.UndefOr[Representation] = js.native
    
    def git(): String = js.native
    def git(opts: FillOptions): String = js.native
    
    var gittemplate: js.UndefOr[String] = js.native
    
    def hash(): String = js.native
    
    def hashformat(fragment: String): String = js.native
    
    def https(): String = js.native
    def https(opts: FillOptions): String = js.native
    
    var httpstemplate: String = js.native
    
    var opts: Options = js.native
    
    def path(): String = js.native
    def path(opts: FillOptions): String = js.native
    
    var pathmatch: RegExp = js.native
    
    var pathtemplate: String = js.native
    
    var project: String = js.native
    
    var protocols: js.Array[String] = js.native
    
    var protocols_re: RegExp = js.native
    
    def shortcut(): String = js.native
    def shortcut(opts: FillOptions): String = js.native
    
    var shortcuttemplate: String = js.native
    
    def ssh(): String = js.native
    def ssh(opts: FillOptions): String = js.native
    
    // Templates
    var sshtemplate: String = js.native
    
    def sshurl(): String = js.native
    def sshurl(opts: FillOptions): String = js.native
    
    var sshurltemplate: String = js.native
    
    def tarball(): String = js.native
    def tarball(opts: FillOptions): String = js.native
    
    var tarballtemplate: String = js.native
    
    def toString(opts: FillOptions): String = js.native
    
    var treepath: js.UndefOr[String] = js.native
    
    var `type`: Hosts = js.native
    
    var user: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hostedGitInfo.hostedGitInfoStrings.github
    - typings.hostedGitInfo.hostedGitInfoStrings.bitbucket
    - typings.hostedGitInfo.hostedGitInfoStrings.gitlab
    - typings.hostedGitInfo.hostedGitInfoStrings.gist
  */
  trait Hosts extends StObject
  object Hosts {
    
    inline def bitbucket: typings.hostedGitInfo.hostedGitInfoStrings.bitbucket = "bitbucket".asInstanceOf[typings.hostedGitInfo.hostedGitInfoStrings.bitbucket]
    
    inline def gist: typings.hostedGitInfo.hostedGitInfoStrings.gist = "gist".asInstanceOf[typings.hostedGitInfo.hostedGitInfoStrings.gist]
    
    inline def github: typings.hostedGitInfo.hostedGitInfoStrings.github = "github".asInstanceOf[typings.hostedGitInfo.hostedGitInfoStrings.github]
    
    inline def gitlab: typings.hostedGitInfo.hostedGitInfoStrings.gitlab = "gitlab".asInstanceOf[typings.hostedGitInfo.hostedGitInfoStrings.gitlab]
  }
  
  trait Options extends StObject {
    
    var noCommittish: js.UndefOr[Boolean] = js.undefined
    
    var noGitPlus: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setNoCommittish(value: Boolean): Self = StObject.set(x, "noCommittish", value.asInstanceOf[js.Any])
      
      inline def setNoCommittishUndefined: Self = StObject.set(x, "noCommittish", js.undefined)
      
      inline def setNoGitPlus(value: Boolean): Self = StObject.set(x, "noGitPlus", value.asInstanceOf[js.Any])
      
      inline def setNoGitPlusUndefined: Self = StObject.set(x, "noGitPlus", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hostedGitInfo.hostedGitInfoStrings.hash
    - typings.hostedGitInfo.hostedGitInfoStrings.ssh
    - typings.hostedGitInfo.hostedGitInfoStrings.sshurl
    - typings.hostedGitInfo.hostedGitInfoStrings.browse
    - typings.hostedGitInfo.hostedGitInfoStrings.docs
    - typings.hostedGitInfo.hostedGitInfoStrings.bugs
    - typings.hostedGitInfo.hostedGitInfoStrings.https
    - typings.hostedGitInfo.hostedGitInfoStrings.git
    - typings.hostedGitInfo.hostedGitInfoStrings.shortcut
    - typings.hostedGitInfo.hostedGitInfoStrings.path
    - typings.hostedGitInfo.hostedGitInfoStrings.tarball
    - typings.hostedGitInfo.hostedGitInfoStrings.file
  */
  trait Representation extends StObject
  object Representation {
    
    inline def browse: typings.hostedGitInfo.hostedGitInfoStrings.browse = "browse".asInstanceOf[typings.hostedGitInfo.hostedGitInfoStrings.browse]
    
    inline def bugs: typings.hostedGitInfo.hostedGitInfoStrings.bugs = "bugs".asInstanceOf[typings.hostedGitInfo.hostedGitInfoStrings.bugs]
    
    inline def docs: typings.hostedGitInfo.hostedGitInfoStrings.docs = "docs".asInstanceOf[typings.hostedGitInfo.hostedGitInfoStrings.docs]
    
    inline def file: typings.hostedGitInfo.hostedGitInfoStrings.file = "file".asInstanceOf[typings.hostedGitInfo.hostedGitInfoStrings.file]
    
    inline def git: typings.hostedGitInfo.hostedGitInfoStrings.git = "git".asInstanceOf[typings.hostedGitInfo.hostedGitInfoStrings.git]
    
    inline def hash: typings.hostedGitInfo.hostedGitInfoStrings.hash = "hash".asInstanceOf[typings.hostedGitInfo.hostedGitInfoStrings.hash]
    
    inline def https: typings.hostedGitInfo.hostedGitInfoStrings.https = "https".asInstanceOf[typings.hostedGitInfo.hostedGitInfoStrings.https]
    
    inline def path: typings.hostedGitInfo.hostedGitInfoStrings.path = "path".asInstanceOf[typings.hostedGitInfo.hostedGitInfoStrings.path]
    
    inline def shortcut: typings.hostedGitInfo.hostedGitInfoStrings.shortcut = "shortcut".asInstanceOf[typings.hostedGitInfo.hostedGitInfoStrings.shortcut]
    
    inline def ssh: typings.hostedGitInfo.hostedGitInfoStrings.ssh = "ssh".asInstanceOf[typings.hostedGitInfo.hostedGitInfoStrings.ssh]
    
    inline def sshurl: typings.hostedGitInfo.hostedGitInfoStrings.sshurl = "sshurl".asInstanceOf[typings.hostedGitInfo.hostedGitInfoStrings.sshurl]
    
    inline def tarball: typings.hostedGitInfo.hostedGitInfoStrings.tarball = "tarball".asInstanceOf[typings.hostedGitInfo.hostedGitInfoStrings.tarball]
  }
}
