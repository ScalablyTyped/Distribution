package typings.ipfsHttpServer

import typings.ipfsHttpServer.anon.Handler
import typings.ipfsHttpServer.anon.HandlerOptions
import typings.ipfsHttpServer.anon.Typeof_import
import typings.ipfsHttpServer.anon.Typeof_new
import typings.ipfsHttpServer.anon.Typeofadd
import typings.ipfsHttpServer.anon.TypeofaddDefault
import typings.ipfsHttpServer.anon.TypeofaddHandler
import typings.ipfsHttpServer.anon.Typeofaddrs
import typings.ipfsHttpServer.anon.Typeofbw
import typings.ipfsHttpServer.anon.Typeofcat
import typings.ipfsHttpServer.anon.Typeofconnect
import typings.ipfsHttpServer.anon.Typeofdata
import typings.ipfsHttpServer.anon.Typeofdisconnect
import typings.ipfsHttpServer.anon.TypeoffindPeer
import typings.ipfsHttpServer.anon.TypeoffindProvs
import typings.ipfsHttpServer.anon.Typeofgc
import typings.ipfsHttpServer.anon.Typeofgen
import typings.ipfsHttpServer.anon.Typeofget
import typings.ipfsHttpServer.anon.TypeofgetHandler
import typings.ipfsHttpServer.anon.TypeofgetOptions
import typings.ipfsHttpServer.anon.TypeofgetOptions4
import typings.ipfsHttpServer.anon.TypeofgetOrSet
import typings.ipfsHttpServer.anon.Typeofimport
import typings.ipfsHttpServer.anon.Typeoflinks
import typings.ipfsHttpServer.anon.Typeoflist
import typings.ipfsHttpServer.anon.TypeoflocalAddrs
import typings.ipfsHttpServer.anon.Typeofls
import typings.ipfsHttpServer.anon.TypeoflsHandler
import typings.ipfsHttpServer.anon.TypeoflsOptions4
import typings.ipfsHttpServer.anon.Typeofnew
import typings.ipfsHttpServer.anon.TypeofpatchAddLink
import typings.ipfsHttpServer.anon.TypeofpatchAppendData
import typings.ipfsHttpServer.anon.TypeofpatchRmLink
import typings.ipfsHttpServer.anon.TypeofpatchSetData
import typings.ipfsHttpServer.anon.Typeofpeers
import typings.ipfsHttpServer.anon.TypeofpeersHandler
import typings.ipfsHttpServer.anon.Typeofprofiles
import typings.ipfsHttpServer.anon.Typeofprovide
import typings.ipfsHttpServer.anon.Typeofpublish
import typings.ipfsHttpServer.anon.TypeofpublishHandler
import typings.ipfsHttpServer.anon.Typeofpubsub
import typings.ipfsHttpServer.anon.Typeofput
import typings.ipfsHttpServer.anon.TypeofputHandler
import typings.ipfsHttpServer.anon.TypeofputOptions2
import typings.ipfsHttpServer.anon.TypeofputOptions8
import typings.ipfsHttpServer.anon.Typeofquery
import typings.ipfsHttpServer.anon.Typeofrefs
import typings.ipfsHttpServer.anon.TypeofrefsLocal
import typings.ipfsHttpServer.anon.Typeofrename
import typings.ipfsHttpServer.anon.Typeofreplace
import typings.ipfsHttpServer.anon.Typeofresolve
import typings.ipfsHttpServer.anon.TypeofresolveHandler
import typings.ipfsHttpServer.anon.Typeofrm
import typings.ipfsHttpServer.anon.TypeofrmAll
import typings.ipfsHttpServer.anon.TypeofrmHandler
import typings.ipfsHttpServer.anon.TypeofrmHandler1
import typings.ipfsHttpServer.anon.Typeofshow
import typings.ipfsHttpServer.anon.Typeofstat
import typings.ipfsHttpServer.anon.TypeofstatHandler
import typings.ipfsHttpServer.anon.TypeofstatOptions2
import typings.ipfsHttpServer.anon.Typeofsubscribe
import typings.ipfsHttpServer.anon.Typeofunwant
import typings.ipfsHttpServer.anon.Typeofversion
import typings.ipfsHttpServer.anon.Typeofwantlist
import typings.ipfsHttpServer.anon.Validate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourcesMod {
  
  object bitswap {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "bitswap.stat")
    @js.native
    val stat: TypeofstatOptions2 = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "bitswap.unwant")
    @js.native
    val unwant: Typeofunwant = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "bitswap.wantlist")
    @js.native
    val wantlist: Typeofwantlist = js.native
  }
  
  object block {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "block.get")
    @js.native
    val get: TypeofgetHandler = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "block.put")
    @js.native
    val put: TypeofputHandler = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "block.rm")
    @js.native
    val rm: TypeofrmHandler = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "block.stat")
    @js.native
    val stat: TypeofstatHandler = js.native
  }
  
  object bootstrap {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "bootstrap.add")
    @js.native
    val add: Typeofadd = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "bootstrap.addDefault")
    @js.native
    val addDefault: TypeofaddDefault = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "bootstrap.list")
    @js.native
    val list: Typeoflist = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "bootstrap.rm")
    @js.native
    val rm: Typeofrm = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "bootstrap.rmAll")
    @js.native
    val rmAll: TypeofrmAll = js.native
  }
  
  object config {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "config.get")
    @js.native
    val get: Typeofget = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "config.getOrSet")
    @js.native
    val getOrSet: TypeofgetOrSet = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "config.profiles")
    @js.native
    val profiles: Typeofprofiles = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "config.replace")
    @js.native
    val replace: Typeofreplace = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "config.show")
    @js.native
    val show: Typeofshow = js.native
  }
  
  object dag {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "dag.get")
    @js.native
    val get: TypeofgetOptions = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "dag.put")
    @js.native
    val put: TypeofputOptions2 = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "dag.resolve")
    @js.native
    val resolve: Typeofresolve = js.native
  }
  
  object dht {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "dht.findPeer")
    @js.native
    val findPeer: TypeoffindPeer = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "dht.findProvs")
    @js.native
    val findProvs: TypeoffindProvs = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "dht.get")
    @js.native
    val get: TypeofgetOptions4 = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "dht.provide")
    @js.native
    val provide: Typeofprovide = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "dht.put")
    @js.native
    val put: TypeofputOptions8 = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "dht.query")
    @js.native
    val query: Typeofquery = js.native
  }
  
  object dns {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "dns")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "dns.handler")
    @js.native
    def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "dns.options")
    @js.native
    def options: Validate = js.native
    @scala.inline
    def options_=(x: Validate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  object files {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "files")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "files.chmod")
    @js.native
    def chmod: Handler = js.native
    @scala.inline
    def chmod_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chmod")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "files.cp")
    @js.native
    def cp: Handler = js.native
    @scala.inline
    def cp_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cp")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "files.flush")
    @js.native
    def flush: Handler = js.native
    @scala.inline
    def flush_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flush")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "files.ls")
    @js.native
    def ls: Handler = js.native
    @scala.inline
    def ls_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ls")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "files.mkdir")
    @js.native
    def mkdir: Handler = js.native
    @scala.inline
    def mkdir_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mkdir")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "files.mv")
    @js.native
    def mv: Handler = js.native
    @scala.inline
    def mv_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mv")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "files.read")
    @js.native
    def read: Handler = js.native
    @scala.inline
    def read_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("read")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "files.rm")
    @js.native
    def rm: Handler = js.native
    @scala.inline
    def rm_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rm")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "files.stat")
    @js.native
    def stat: Handler = js.native
    @scala.inline
    def stat_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stat")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "files.touch")
    @js.native
    def touch: Handler = js.native
    @scala.inline
    def touch_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touch")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "files.write")
    @js.native
    def write: HandlerOptions = js.native
    @scala.inline
    def write_=(x: HandlerOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("write")(x.asInstanceOf[js.Any])
  }
  
  object filesRegular {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "filesRegular.add")
    @js.native
    val add: TypeofaddHandler = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "filesRegular.cat")
    @js.native
    val cat: Typeofcat = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "filesRegular.get")
    @js.native
    val get: Typeofget = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "filesRegular.ls")
    @js.native
    val ls: TypeoflsHandler = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "filesRegular.refs")
    @js.native
    val refs: Typeofrefs = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "filesRegular.refsLocal")
    @js.native
    val refsLocal: TypeofrefsLocal = js.native
  }
  
  object id {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "id")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "id.handler")
    @js.native
    def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "id.options")
    @js.native
    def options: Validate = js.native
    @scala.inline
    def options_=(x: Validate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  object key {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "key._import")
    @js.native
    val _import: Typeof_import = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "key.gen")
    @js.native
    val gen: Typeofgen = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "key.list")
    @js.native
    val list: Typeoflist = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "key.rename")
    @js.native
    val rename: Typeofrename = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "key.rm")
    @js.native
    val rm: TypeofrmHandler1 = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "key.import")
    @js.native
    val `import`: Typeofimport = js.native
  }
  
  object name {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "name.publish")
    @js.native
    val publish: TypeofpublishHandler = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "name.pubsub")
    @js.native
    val pubsub: Typeofpubsub = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "name.resolve")
    @js.native
    val resolve: TypeofresolveHandler = js.native
  }
  
  object pin {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "pin.add")
    @js.native
    val add: Typeofadd = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "pin.ls")
    @js.native
    val ls: Typeofls = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "pin.rm")
    @js.native
    val rm: TypeofrmHandler = js.native
  }
  
  object ping {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "ping")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "ping.handler")
    @js.native
    def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "ping.options")
    @js.native
    def options: Validate = js.native
    @scala.inline
    def options_=(x: Validate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  object pubsub {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "pubsub.ls")
    @js.native
    val ls: TypeoflsOptions4 = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "pubsub.peers")
    @js.native
    val peers: TypeofpeersHandler = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "pubsub.publish")
    @js.native
    val publish: Typeofpublish = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "pubsub.subscribe")
    @js.native
    val subscribe: Typeofsubscribe = js.native
  }
  
  object repo {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "repo.gc")
    @js.native
    val gc: Typeofgc = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "repo.stat")
    @js.native
    val stat: Typeofstat = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "repo.version")
    @js.native
    val version: Typeofversion = js.native
  }
  
  object resolve {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "resolve")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "resolve.handler")
    @js.native
    def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "resolve.options")
    @js.native
    def options: Validate = js.native
    @scala.inline
    def options_=(x: Validate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  object shutdown {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "shutdown.handler")
    @js.native
    def handler(_request: js.Any, h: js.Any): js.Any = js.native
  }
  
  object stats {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "stats")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "stats.bitswap")
    @js.native
    def bitswap: Handler = js.native
    @scala.inline
    def bitswap_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitswap")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "stats.bw")
    @js.native
    val bw: Typeofbw = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "stats.repo")
    @js.native
    def repo: Handler = js.native
    @scala.inline
    def repo_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("repo")(x.asInstanceOf[js.Any])
  }
  
  object swarm {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "swarm.addrs")
    @js.native
    val addrs: Typeofaddrs = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "swarm.connect")
    @js.native
    val connect: Typeofconnect = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "swarm.disconnect")
    @js.native
    val disconnect: Typeofdisconnect = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "swarm.localAddrs")
    @js.native
    val localAddrs: TypeoflocalAddrs = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "swarm.peers")
    @js.native
    val peers: Typeofpeers = js.native
  }
  
  object version {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "version")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "version.handler")
    @js.native
    def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "version.options")
    @js.native
    def options: Validate = js.native
    @scala.inline
    def options_=(x: Validate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  object `object` {
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "object._new")
    @js.native
    val _new: Typeof_new = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "object.data")
    @js.native
    val data: Typeofdata = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "object.get")
    @js.native
    val get: Typeofget = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "object.links")
    @js.native
    val links: Typeoflinks = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "object.patchAddLink")
    @js.native
    val patchAddLink: TypeofpatchAddLink = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "object.patchAppendData")
    @js.native
    val patchAppendData: TypeofpatchAppendData = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "object.patchRmLink")
    @js.native
    val patchRmLink: TypeofpatchRmLink = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "object.patchSetData")
    @js.native
    val patchSetData: TypeofpatchSetData = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "object.put")
    @js.native
    val put: Typeofput = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "object.stat")
    @js.native
    val stat: TypeofstatHandler = js.native
    
    @JSImport("ipfs-http-server/dist/src/api/resources", "object.new")
    @js.native
    val `new`: Typeofnew = js.native
  }
}
