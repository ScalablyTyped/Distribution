package typings.ionic

import typings.ionic.definitionsMod.AssociationType
import typings.ionic.definitionsMod.DistTag
import typings.ionic.definitionsMod.HookName
import typings.ionic.definitionsMod.HttpMethod
import typings.ionic.definitionsMod.InfoItemGroup
import typings.ionic.definitionsMod.IntegrationName
import typings.ionic.definitionsMod.KnownPlatform
import typings.ionic.definitionsMod.KnownResourceType
import typings.ionic.definitionsMod.NpmClient
import typings.ionic.definitionsMod.ProjectType
import typings.ionic.libProjectMod.ProjectDetailsErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ionicStrings {
  @js.native
  sealed trait `0DOT0DOT0DOT0` extends js.Object
  
  @js.native
  sealed trait DELETE extends HttpMethod
  
  @js.native
  sealed trait ERR_INVALID_PROJECT_FILE extends ProjectDetailsErrorCode
  
  @js.native
  sealed trait ERR_INVALID_PROJECT_TYPE extends ProjectDetailsErrorCode
  
  @js.native
  sealed trait ERR_MISSING_PROJECT_TYPE extends ProjectDetailsErrorCode
  
  @js.native
  sealed trait ERR_MULTI_MISSING_CONFIG extends ProjectDetailsErrorCode
  
  @js.native
  sealed trait ERR_MULTI_MISSING_ID extends ProjectDetailsErrorCode
  
  @js.native
  sealed trait Exception extends js.Object
  
  @js.native
  sealed trait GET extends HttpMethod
  
  @js.native
  sealed trait HEAD extends HttpMethod
  
  @js.native
  sealed trait OAuthIdentity extends js.Object
  
  @js.native
  sealed trait OPTIONS extends HttpMethod
  
  @js.native
  sealed trait PATCH extends HttpMethod
  
  @js.native
  sealed trait POST extends HttpMethod
  
  @js.native
  sealed trait PURGE extends HttpMethod
  
  @js.native
  sealed trait PUT extends HttpMethod
  
  @js.native
  sealed trait UNKNOWN_CONTENT_TYPE extends js.Object
  
  @js.native
  sealed trait UNKNOWN_RESPONSE_FORMAT extends js.Object
  
  @js.native
  sealed trait Yarn extends js.Object
  
  @js.native
  sealed trait android extends KnownPlatform
  
  @js.native
  sealed trait angular extends ProjectType
  
  @js.native
  sealed trait app extends js.Object
  
  @js.native
  sealed trait `application/json` extends js.Object
  
  @js.native
  sealed trait bare extends ProjectType
  
  @js.native
  sealed trait bitbucket_cloud extends AssociationType
  
  @js.native
  sealed trait bitbucket_server extends AssociationType
  
  @js.native
  sealed trait browser extends KnownPlatform
  
  @js.native
  sealed trait `build:after` extends HookName
  
  @js.native
  sealed trait `build:before` extends HookName
  
  @js.native
  sealed trait canary extends DistTag
  
  @js.native
  sealed trait capacitor
    extends InfoItemGroup
       with IntegrationName
  
  @js.native
  sealed trait compile extends js.Object
  
  @js.native
  sealed trait cordova
    extends InfoItemGroup
       with IntegrationName
  
  @js.native
  sealed trait custom extends ProjectType
  
  @js.native
  sealed trait development extends js.Object
  
  @js.native
  sealed trait enterprise extends IntegrationName
  
  @js.native
  sealed trait environment extends InfoItemGroup
  
  @js.native
  sealed trait github extends AssociationType
  
  @js.native
  sealed trait global extends js.Object
  
  @js.native
  sealed trait guard extends js.Object
  
  @js.native
  sealed trait icon extends KnownResourceType
  
  @js.native
  sealed trait ionic extends InfoItemGroup
  
  @js.native
  sealed trait `ionic-angular` extends ProjectType
  
  @js.native
  sealed trait ionic1 extends ProjectType
  
  @js.native
  sealed trait `ionic:build` extends js.Object
  
  @js.native
  sealed trait `ionic:serve` extends js.Object
  
  @js.native
  sealed trait ionicDOTconfigDOTjson extends js.Object
  
  @js.native
  sealed trait ios extends KnownPlatform
  
  @js.native
  sealed trait landscape extends js.Object
  
  @js.native
  sealed trait latest extends DistTag
  
  @js.native
  sealed trait localhost extends js.Object
  
  @js.native
  sealed trait managed extends js.Object
  
  @js.native
  sealed trait max extends js.Object
  
  @js.native
  sealed trait multiapp extends js.Object
  
  @js.native
  sealed trait npm extends NpmClient
  
  @js.native
  sealed trait `npm CLI` extends js.Object
  
  @js.native
  sealed trait portrait extends js.Object
  
  @js.native
  sealed trait production extends js.Object
  
  @js.native
  sealed trait project extends js.Object
  
  @js.native
  sealed trait react extends ProjectType
  
  @js.native
  sealed trait ready extends js.Object
  
  @js.native
  sealed trait repo extends js.Object
  
  @js.native
  sealed trait reqgen extends js.Object
  
  @js.native
  sealed trait `serve:after` extends HookName
  
  @js.native
  sealed trait `serve:before` extends HookName
  
  @js.native
  sealed trait splash extends KnownResourceType
  
  @js.native
  sealed trait `ssl-commands` extends js.Object
  
  @js.native
  sealed trait state extends js.Object
  
  @js.native
  sealed trait system extends InfoItemGroup
  
  @js.native
  sealed trait telemetry extends js.Object
  
  @js.native
  sealed trait testing extends DistTag
  
  @js.native
  sealed trait unknown extends js.Object
  
  @js.native
  sealed trait `update-check` extends js.Object
  
  @js.native
  sealed trait utility extends InfoItemGroup
  
  @js.native
  sealed trait vue extends ProjectType
  
  @js.native
  sealed trait windows extends KnownPlatform
  
  @js.native
  sealed trait wp8 extends KnownPlatform
  
  @js.native
  sealed trait yarn extends NpmClient
  
  @scala.inline
  def `0DOT0DOT0DOT0`: `0DOT0DOT0DOT0` = "0.0.0.0".asInstanceOf[`0DOT0DOT0DOT0`]
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def ERR_INVALID_PROJECT_FILE: ERR_INVALID_PROJECT_FILE = "ERR_INVALID_PROJECT_FILE".asInstanceOf[ERR_INVALID_PROJECT_FILE]
  @scala.inline
  def ERR_INVALID_PROJECT_TYPE: ERR_INVALID_PROJECT_TYPE = "ERR_INVALID_PROJECT_TYPE".asInstanceOf[ERR_INVALID_PROJECT_TYPE]
  @scala.inline
  def ERR_MISSING_PROJECT_TYPE: ERR_MISSING_PROJECT_TYPE = "ERR_MISSING_PROJECT_TYPE".asInstanceOf[ERR_MISSING_PROJECT_TYPE]
  @scala.inline
  def ERR_MULTI_MISSING_CONFIG: ERR_MULTI_MISSING_CONFIG = "ERR_MULTI_MISSING_CONFIG".asInstanceOf[ERR_MULTI_MISSING_CONFIG]
  @scala.inline
  def ERR_MULTI_MISSING_ID: ERR_MULTI_MISSING_ID = "ERR_MULTI_MISSING_ID".asInstanceOf[ERR_MULTI_MISSING_ID]
  @scala.inline
  def Exception: Exception = "Exception".asInstanceOf[Exception]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  @scala.inline
  def OAuthIdentity: OAuthIdentity = "OAuthIdentity".asInstanceOf[OAuthIdentity]
  @scala.inline
  def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PURGE: PURGE = "PURGE".asInstanceOf[PURGE]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  @scala.inline
  def UNKNOWN_CONTENT_TYPE: UNKNOWN_CONTENT_TYPE = "UNKNOWN_CONTENT_TYPE".asInstanceOf[UNKNOWN_CONTENT_TYPE]
  @scala.inline
  def UNKNOWN_RESPONSE_FORMAT: UNKNOWN_RESPONSE_FORMAT = "UNKNOWN_RESPONSE_FORMAT".asInstanceOf[UNKNOWN_RESPONSE_FORMAT]
  @scala.inline
  def Yarn: Yarn = "Yarn".asInstanceOf[Yarn]
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  @scala.inline
  def angular: angular = "angular".asInstanceOf[angular]
  @scala.inline
  def app: app = "app".asInstanceOf[app]
  @scala.inline
  def `application/json`: `application/json` = "application/json".asInstanceOf[`application/json`]
  @scala.inline
  def bare: bare = "bare".asInstanceOf[bare]
  @scala.inline
  def bitbucket_cloud: bitbucket_cloud = "bitbucket_cloud".asInstanceOf[bitbucket_cloud]
  @scala.inline
  def bitbucket_server: bitbucket_server = "bitbucket_server".asInstanceOf[bitbucket_server]
  @scala.inline
  def browser: browser = "browser".asInstanceOf[browser]
  @scala.inline
  def `build:after`: `build:after` = "build:after".asInstanceOf[`build:after`]
  @scala.inline
  def `build:before`: `build:before` = "build:before".asInstanceOf[`build:before`]
  @scala.inline
  def canary: canary = "canary".asInstanceOf[canary]
  @scala.inline
  def capacitor: capacitor = "capacitor".asInstanceOf[capacitor]
  @scala.inline
  def compile: compile = "compile".asInstanceOf[compile]
  @scala.inline
  def cordova: cordova = "cordova".asInstanceOf[cordova]
  @scala.inline
  def custom: custom = "custom".asInstanceOf[custom]
  @scala.inline
  def development: development = "development".asInstanceOf[development]
  @scala.inline
  def enterprise: enterprise = "enterprise".asInstanceOf[enterprise]
  @scala.inline
  def environment: environment = "environment".asInstanceOf[environment]
  @scala.inline
  def github: github = "github".asInstanceOf[github]
  @scala.inline
  def global: global = "global".asInstanceOf[global]
  @scala.inline
  def guard: guard = "guard".asInstanceOf[guard]
  @scala.inline
  def icon: icon = "icon".asInstanceOf[icon]
  @scala.inline
  def ionic: ionic = "ionic".asInstanceOf[ionic]
  @scala.inline
  def `ionic-angular`: `ionic-angular` = "ionic-angular".asInstanceOf[`ionic-angular`]
  @scala.inline
  def ionic1: ionic1 = "ionic1".asInstanceOf[ionic1]
  @scala.inline
  def `ionic:build`: `ionic:build` = "ionic:build".asInstanceOf[`ionic:build`]
  @scala.inline
  def `ionic:serve`: `ionic:serve` = "ionic:serve".asInstanceOf[`ionic:serve`]
  @scala.inline
  def ionicDOTconfigDOTjson: ionicDOTconfigDOTjson = "ionic.config.json".asInstanceOf[ionicDOTconfigDOTjson]
  @scala.inline
  def ios: ios = "ios".asInstanceOf[ios]
  @scala.inline
  def landscape: landscape = "landscape".asInstanceOf[landscape]
  @scala.inline
  def latest: latest = "latest".asInstanceOf[latest]
  @scala.inline
  def localhost: localhost = "localhost".asInstanceOf[localhost]
  @scala.inline
  def managed: managed = "managed".asInstanceOf[managed]
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  @scala.inline
  def multiapp: multiapp = "multiapp".asInstanceOf[multiapp]
  @scala.inline
  def npm: npm = "npm".asInstanceOf[npm]
  @scala.inline
  def `npm CLI`: `npm CLI` = "npm CLI".asInstanceOf[`npm CLI`]
  @scala.inline
  def portrait: portrait = "portrait".asInstanceOf[portrait]
  @scala.inline
  def production: production = "production".asInstanceOf[production]
  @scala.inline
  def project: project = "project".asInstanceOf[project]
  @scala.inline
  def react: react = "react".asInstanceOf[react]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def repo: repo = "repo".asInstanceOf[repo]
  @scala.inline
  def reqgen: reqgen = "reqgen".asInstanceOf[reqgen]
  @scala.inline
  def `serve:after`: `serve:after` = "serve:after".asInstanceOf[`serve:after`]
  @scala.inline
  def `serve:before`: `serve:before` = "serve:before".asInstanceOf[`serve:before`]
  @scala.inline
  def splash: splash = "splash".asInstanceOf[splash]
  @scala.inline
  def `ssl-commands`: `ssl-commands` = "ssl-commands".asInstanceOf[`ssl-commands`]
  @scala.inline
  def state: state = "state".asInstanceOf[state]
  @scala.inline
  def system: system = "system".asInstanceOf[system]
  @scala.inline
  def telemetry: telemetry = "telemetry".asInstanceOf[telemetry]
  @scala.inline
  def testing: testing = "testing".asInstanceOf[testing]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  @scala.inline
  def `update-check`: `update-check` = "update-check".asInstanceOf[`update-check`]
  @scala.inline
  def utility: utility = "utility".asInstanceOf[utility]
  @scala.inline
  def vue: vue = "vue".asInstanceOf[vue]
  @scala.inline
  def windows: windows = "windows".asInstanceOf[windows]
  @scala.inline
  def wp8: wp8 = "wp8".asInstanceOf[wp8]
  @scala.inline
  def yarn: yarn = "yarn".asInstanceOf[yarn]
}

