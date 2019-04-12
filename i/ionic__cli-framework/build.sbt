organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.7.0-0468a4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-escapes" % "4.1.0-2c89dd",
  "org.scalablytyped" %%% "ansi-regex" % "4.0-dt-20181220Z-1c76d2",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-d84c1e",
  "org.scalablytyped" %%% "chalk" % "2.4.2-ca1e30",
  "org.scalablytyped" %%% "cli-cursor" % "2.1-dt-20181224Z-89d58b",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-5a34a6",
  "org.scalablytyped" %%% "cross-spawn" % "6.0-dt-20190228Z-358b5f",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-98f533",
  "org.scalablytyped" %%% "emoji-regex" % "7.0-dt-20190212Z-c838af",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-faeaa3",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-d1d8d8",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-a3b219",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190322Z-807a70",
  "org.scalablytyped" %%% "ionic__utils-array" % "0.0.1-a4e4e8",
  "org.scalablytyped" %%% "ionic__utils-fs" % "1.2.0-01e2da",
  "org.scalablytyped" %%% "ionic__utils-object" % "0.0.1-7b7b54",
  "org.scalablytyped" %%% "ionic__utils-process" % "0.1.0-8177cd",
  "org.scalablytyped" %%% "ionic__utils-stream" % "0.0.1-488c0b",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "0.1.0-c55222",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "0.0.1-97fb12",
  "org.scalablytyped" %%% "is-fullwidth-code-point" % "3.0.0-bd318a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "log-update" % "3.2.0-2faaa3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-8cca44",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-2921e7",
  "org.scalablytyped" %%% "rxjs" % "6.4.0-f8b93e",
  "org.scalablytyped" %%% "slice-ansi" % "2.0-dt-20181119Z-04a587",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "string-width" % "4.1.0-5e0468",
  "org.scalablytyped" %%% "strip-ansi" % "5.2.0-0ac2ec",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-1b70da",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-fac596",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-001cca",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-26977f",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32",
  "org.scalablytyped" %%% "type-fest" % "0.3.0-45433e",
  "org.scalablytyped" %%% "untildify" % "3.0-dt-20180214Z-4bc477",
  "org.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20190322Z-e3af9b",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-131d91")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        