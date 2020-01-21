organization := "org.scalablytyped"
name := "http-rx"
version := "2.0-dt-20190113Z-7da48f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-e1be95",
  "org.scalablytyped" %%% "form-data" % "2.5.1-716451",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "request" % "2.48-dt-20191217Z-1f1031",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-81a9cd",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-a24188",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20191206Z-711cb5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        