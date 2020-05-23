organization := "org.scalablytyped"
name := "material__select"
version := "0.35-dt-20200515Z-095038"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20200515Z-64199d",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20200515Z-ccd4cd",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20200515Z-82f09c",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
