organization := "org.scalablytyped"
name := "gulp-tslint"
version := "8.1.4-6d8a3b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-4c57d8",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-749fa6",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20190212Z-780072",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-f0ca66",
  "org.scalablytyped" %%% "chalk" % "2.4.2-3344ae",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-7e7317",
  "org.scalablytyped" %%% "commander" % "2.19.0-708743",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190322Z-63b240",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-0fc5fc",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20190212Z-aee959",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-805214",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-26cfe6",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-cec35d",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-727fc1",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-ce2f76",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20190322Z-7fef71",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-816092",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-b01a75",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-b31e80",
  "org.scalablytyped" %%% "tslib" % "1.9.3-f320f9",
  "org.scalablytyped" %%% "tslint" % "5.14.0-5e6c75",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-118a5c",
  "org.scalablytyped" %%% "typescript" % "3.3.4000-bb3585")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        