organization := "org.scalablytyped"
name := "html-minifier"
version := "3.5-dt-20190212Z-6a53ae"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-340e6e",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-84d89d",
  "org.scalablytyped" %%% "source-map" % "0.7.3-f4c7eb",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-0ca3a8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        